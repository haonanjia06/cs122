import sys
import socket
import time

MIN_SERVER_PORT = 1024
MAX_SERVER_PORT = 65535
CHUNK_SIZE_IN_BYTES = 1000


def check_args_for_client():
    args = sys.argv[1::]

    if len(args) != 3:
        print("Error: missing or additional arguments")
        exit()

    server_hostname = args[0]
    server_port = args[1]
    time_in_sec = args[2]

    try:
        # check whether the hostname is a valid IP address
        socket.inet_aton(server_hostname)
    except socket.error:
        print("Error: missing or additional arguments")

    try:
        # check whether the server port number is an int and in the correct range
        server_port = int(server_port)
        if server_port <= MIN_SERVER_PORT or server_port >= MAX_SERVER_PORT:
            print("Error: port number must be in the range {} to {}".format(MIN_SERVER_PORT, MAX_SERVER_PORT))
            exit()
        # check whether the time is a number
        time_in_sec = float(time_in_sec)
    except ValueError:
        print("Error: missing or additional arguments")
        exit()

    return server_hostname, server_port, time_in_sec


def run_as_client(server_hostname, server_port, time_in_sec):
    dummy_chunk = bytes(CHUNK_SIZE_IN_BYTES)
    chunk_cnt = 0

    client_sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_sock.connect((server_hostname, server_port))

    start_time = time.time()
    while time.time() - start_time < time_in_sec:
        client_sock.sendall(dummy_chunk)
        chunk_cnt += 1
    actual_run_time = time.time() - start_time
    client_sock.close()

    data_sent_rate = (chunk_cnt * 8) / actual_run_time
    print("sent={} KB ".format(chunk_cnt))
    print("rate={} Mbps\n".format(data_sent_rate))


if __name__ == '__main__':
    hostname, port, run_time = check_args_for_client()
    run_as_client(hostname, port, run_time)
