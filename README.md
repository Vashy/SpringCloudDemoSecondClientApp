# Application Boot
Run the following command to build the docker image:

    docker build -t second-client-app:latest .

And then run it:

    docker run -it --rm -p 8891:8891 --net=spring-cloud-app --name=second-client-app second-client-app:latest

