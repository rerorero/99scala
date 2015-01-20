#!/bin/sh

number="P$1"
main_file="./src/main/scala/${number}.scala"
test_file="./src/test/scala/${number}Spec.scala"

if [ -f $main_file ]; then
  echo "Error: Already exists!"
  exit 1
fi

if [ -f $test_file ]; then
  echo "Error: Already exists!"
  exit 1
fi
  
cp ./template/PNUMBER.scala $main_file
cp ./template/PNUMBERSpec.scala $test_file

sed -i"" -e "s/PNUMBER/$number/g" $main_file
sed -i"" -e "s/PNUMBER/$number/g" $test_file

if [ -f "./.git/config" ]; then
  git add $main_file
  git add $test_file
fi

echo $main_file
echo $test_file
