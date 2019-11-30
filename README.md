# jubilant-parakeet - Password extractor

# This neat little java program takes your inputed potfiles and extracts the last column
# that most often is the clear text passwords and creates a quick and dirty wordlist of your potfile.
# It takes all last strings delimited by the last ':' (see the examples bellow) and outputs them line by
# line to your specified output file of choice:
#
# Username:Email:Hash:Salt:ClearTextPassword1
# Username:Hash:ClearTextPassword2
# Hash:ClearTextPassword3
# 
# The results in the output file would look like this:
# ClearTextPassword1
# ClearTextPassword2
# ClearTextPassword3
#
# This program could also be used to extract other strings after the last delimiter of ':' 

# Compiling from source and usage (Debian based distros)
# All following steps are made in your terminal of choice:


#### Step 1 (download and dependencies) ####
# Clone into this repo to download the files to your local machine
git clone https://github.com/originalsnigelkott/jubilant-parakeet.git

# Make sure you have java installed on your machine before proceding to compile the code
java -version

# If your output looks something like the following you have java installed and skip to step 2:
openjdk version "11.0.4" 2019-07-16
OpenJDK Runtime Environment (build 11.0.4+11-post-Ubuntu-1ubuntu218.04.3)
OpenJDK 64-Bit Server VM (build 11.0.4+11-post-Ubuntu-1ubuntu218.04.3, mixed mode, sharing)

# If your output looks something like the following you do not have java installed:
bash: /usr/bin/java: No such file or directory

# If you do not have java installed you can install it with:
sudo apt install openjdk-11-jre

# Check if you have the necisary compiler 'javac' too with:
javac -version

# If your output looks like something similar to this you are fine:
javac 11.0.4

# If your output looks like this you do not have the compiler installed:
bash: /usr/bin/javac: No such file or directory

# If you do not have javac installed you can install it with:
sudo apt install openjdk-11-jdk


#### Step 2 (compiling time) ####

# Change directory into cloned git repo's /src 
cd jubilant-parakeet/src

# Compile code with:
javac com/company/*.java


#### Step 3 (running program) ####

# Run program (still in jubilant-parakeet/src):
java com.company.Main

# Input example with a potfile (replace 'USER' with your own username)
# (change directory to where you have your potfile/or another file you want to input):
Enter filename (complete path if in another folder):
/home/USER/.hashcat/hashcat.potfile

# Output example:
Enter save file name (complete path if in another folder):
/home/USER/outputs/outputfile.txt

#### I do not take responsibily for any damage or problems caused by this program. Use at your own risk! ####




















