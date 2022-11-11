javac Main.java

if [ $? != 00 ]
    then 
        echo "Exit code was not zero"
        exit 1
    fi

    echo "Exit code was zero"