declare -a fold=("chap5" "chap6" "chap7" "chap8" "chap9")
for val in ${fold[@]}; do
    cd $val
    shopt -s nullglob
    for file in *.java; do 
        ex -sc "1i|package com.cs122.classlabs.$val;" -cx "$file"
    done
    cd ~/Desktop/SourceCode_java\ 2/
done
