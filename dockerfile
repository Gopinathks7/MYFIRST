FROM ubuntu
RUN apt-get update
RUN DEBIAN_FRONTEND="noninteractive" apt-get -y install tzdata
RUN apt-get -y install apache2
ADD . /home/ubuntu/gitrepo/MYFIRST/TEST
ENTRYPOINT apachectl -D FOREGROUND
