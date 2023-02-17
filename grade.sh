CPATH='.:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar'

rm -rf student-submission
git clone $1 student-submission
echo 'Finished cloning'


if [[ -f student-submission/ListExamples.java ]]
then
    echo "ListExamples.java found"
else 
    echo "File not found"
    exit
fi


cp student-submission/ListExamples.java ListExamples.java

javac -cp $CPATH *.java 2> javac-errs.txt
if [[ $? -ne 0 ]]
then
    echo "Error involving javac-errs.txt"
    exit
fi
java -cp $CPATH org.junit.runner.JUnitCore TestListExamples > junit.txt
RESULT=$(grep -c "failure" junit.txt)

if [[ $RESULT -ne 0 ]]
then
    echo "Failed"
else
    echo "Passed"
fi
