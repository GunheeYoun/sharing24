# sharing24
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1

https://github.com/BaeJoonguk/youtube

https://github.com/msa-ez/example-food-delivery

https://github.com/acmexii?tab=repositories

https://github.com/koseungmin/yes23

 

 

https://workflowy.com/s/msa/27a0ioMCzlpV04Ib 

 

https://spectrum.chat/cna-assessment/kubernetes-docker/maven-project-azure-deploy-docker-client~dfebf0e1-4eb1-46d2-8e17-5f07efa47b81 

 

 

 

Saga : 

	

 

CQRS : CUD와 R를 분리하는 패턴, CRQS는 (데이터를 변경하는) Command 부분을 (데이터를 읽어들이는) Query 로부터 분리시킨다

	

 

Correlation

	

 

 

 

Req/Resp

	동기호출 기반 (ex. 주문취소가 되려면 주문이 선행되어야 함)

 

Gateway 단일 진입점

	Loadbalance 타입이 아닌 gateway

 

Deploy/ Pipeline (파이프라인(git) 적용해도 안해도 됨, 파이프라이는 서비스 별로있음), local에서 그냥 배포deploy해도됨 

	

 

 

Istio ? 

Circuit Breaker : 부하가 걸릴 때 사전에 짤라버려서 나에게 impact안오게 해주는 것 (timeout으로 처리해도 됨)

	

 

Autoscale (HPA), 하나의 서비스에 걸어주면 된다?

	Reources에 limit과 requests가 설정되어 있어야 함.

 

Zero-downtime deploy (Readiness Probe) : 컨테이너가 쿠버네티스 플랫폼에게 신고하는 정보?

	

 

Config Map : 환경변수를 저장하고있다가 yaml파일에서 저장된 환경정보를 걸러줌/ Persistence Volume(PV) : pvc이름으로 마운트? 로그를 남기든 뭐를 하든 해야 인증해줌 

	

 

Polyglot : (language) 다형성, 다른 언어 또는 DB 관점

	

 

Self-healing (Liveness Probe) : restart되도록

 

https://github.com/event-storming/docs

 

===========================로칼에서 진행해야할 작업

1. 리소스 그룹 생성

============================================로칼에서 진행해야할 작업

 

==================================랩실에서 진행하셔야 할 작업

2. 애져 로그인 - az login

3. 애져 클러스터 생성 - 

az aks create --resource-group rscgroup --name sharing23-cluster --node-count 2 --enable-addons monitoring --generate-ssh-keys

az aks create --resource-group (리소스그룹명)yes23-rsrcgroup  --name (클러스터명)yes23-cluster --node-count 2 --enable-addons monitoring --generate-ssh-keys

az aks create --resource-group sharing24-rsrcgroup  --name sharing24-cluster --node-count 2 --enable-addons monitoring --generate-ssh-keys

az aks create --resource-group rscgroup --name sharing-cluster --node-count 2 --enable-addons monitoring --generate-ssh-keys

포탈은(_안먹힘)

az aks create --resource-group rscgroup --name sharing23_cluster --node-count 2 --enable-addons monitoring --generate-ssh-keys

az aks get-credentials --resource-group myResourceGroup --name myAKSCluster

 

 

4. aks 토큰 가져오기 

az aks get-credentials --resource-group rscgroup --name sharing23-cluster

az aks get-credentials --resource-group yes23-rsrcgroup --name yes23-cluster

az aks get-credentials --resource-group sharing24-rsrcgroup --name sharing24-cluster

 

5. acr 생성

az acr create --resource-group rscgroup --name sharing23 --sku Basic

az acr create --resource-group yes23-rsrcgroup --name yes23 --sku Basic

az acr create --resource-group sharing24-rsrcgroup --name sharing24 --sku Basic

 

6. acr 로그인

az acr login --name yes23

az acr login --name sharing23

 

##애저포탈 직접 접속방법

az acr login --name sharing23 --expose-token   

az acr login --name sharing24 --expose-token   

 

7. acr이랑 aks랑 연동(aks에 acr을 붙인다)

az aks update -n sharing23-cluster -g rscgroup --attach-acr sharing23

az aks update -n yes23-cluster(aks명) -g yes23-rsrcgroup(리소스그룹명) --attach-acr yes23(acr 컨테이너 레지스트리명)

az aks update -n sharing24-cluster -g sharing24-rsrcgroup --attach-acr sharing24

az aks update -n sharing23-cluster -g rscgroup --attach-acr sharing23

 

 

kubectl config current-context

 

=======================랩실에서 진행하셔야 할 작업

 

 

=======================깃허브 레파지토리 작업

github.com -> 로그인 

 

홈화면에서 Repositories New 클릭

======================================깃허브 레파지토리 작업

 

=======================로칼에서 진행해야할 작업

레파지토리 생성 이후 프로젝트가 있는 폴더로 이동해서 cmd 

 

git remote rm origin 

명령어를 입력하면 이미 remote origin 이 존재하기 때문에 지워줘야한다.

 

깃 푸쉬를 위한 초기화작업

git init

 

우리의 프로젝트를 git의 어느 repository에 저장(?) 소스 관리 할거냐

git remote add origin https://github.com/GunheeYoun/sharing23

 

 

git remote add origin https://github.com/kmg28801/yes2000.git

 

본인 인증에 대한 명령어

git config --global user.name rjswkd0924

git config --global user.email rjswkd0924@naver.com

 

git commit하기전에 add 작업을 통해 commit 준비

git add .

 

git commit -m "1st commit"

 

git 원격저장소에 푸쉬하는 명령어

git push -u origin master

========================================깃허브 레파지토리 작업

 

 

설계/구현/운영

구현- 이벤트기반메시지채널

http://msaschool.io/#/%EC%84%A4%EA%B3%84--%EA%B5%AC%ED%98%84--%EC%9A%B4%EC%98%81%EB%8B%A8%EA%B3%84/04_%EA%B5%AC%ED%98%84/10_%EC%9D%B4%EB%B2%A4%ED%8A%B8%EA%B8%B0%EB%B0%98%20%EB%A9%94%EC%84%B8%EC%A7%80%20%EC%B1%84%EB%84%90

 

$ helm install my-kafka --namespace kafka incubator/kafka -f values.yml --debu

 

$ helm install --name my-kafka --namespace kafka incubator/kafka -f values.yml --debug

helm search

 

====

헬름이 설치가 안되어 있거나, 버전이 2.xx 일때 카프카 설치 방법

 

 

curl https://raw.githubusercontent.com/kubernetes/helm/master/scripts/get | bash

kubectl --namespace kube-system create sa tiller      # helm 의 설치관리자를 위한 시스템 사용자 생성

kubectl create clusterrolebinding tiller --clusterrole cluster-admin --serviceaccount=kube-system:tiller

helm init --service-account tiller

 

kubectl patch deploy --namespace kube-system tiller-deploy -p '{"spec":{"template":{"spec":{"serviceAccount":"tiller"}}}}'

 

helm repo add incubator http://storage.googleapis.com/kubernetes-charts-incubator

helm repo update

helm install --name my-kafka --namespace kafka incubator/kafka

====

kubectl --namespace kube-system create sa tiller      # helm 의 설치관리자를 위한 시스템 사용자 생성

kubectl create clusterrolebinding tiller --clusterrole cluster-admin --serviceaccount=kube-system:tiller

 

helm repo add incubator http://storage.googleapis.com/kubernetes-charts-incubator

helm repo update

kubectl create ns kafka

helm install my-kafka --namespace kafka incubator/kafka

====

 

 

1. helm의 repository에 bitnami를 추가한다.

helm repo add bitnami https://charts.bitnami.com/bitnami

helm search를 통해 추가된 것을 확인

helm search

kafka가 보인다.

2. kafka를 담을 namespace 생성

 

 

 

kubectl create ns kafka

helm install my-kafka --namespace kafka bitnami/kafka 

 

 

kubectl get po -n kafka ==> 확인

 

 

토픽 생성 (sharingclothes)

 

클러스터 환경에서 토픽을 생성 하여 해당 토픽에서 메세지를 pub/sub 해보기

kubectl -n kafka exec my-kafka-0 – /usr/bin/kafka-topics --zookeeper my-kafka-zookeeper:2181 --topic sharingclothes --create --partitions 1 --replication-factor 1

kubectl -n kafka exec my-kafka-0 -- /usr/bin/kafka-topics --zookeeper my-kafka-zookeeper:2181 --topic sharingclothes --create --partitions 1 --replication-factor 1

 

생성된 토픽을 확인하여 봅니다

kubectl -n kafka exec my-kafka-0 – /usr/bin/kafka-topics --zookeeper my-kafka-zookeeper:2181 --list

 

 

mkdir project ==> 폴더 만들고

 

===============================랩실에서 진행해야 할 작업

 

 

 

랩실에서 /home/project(교육에서는 이 장소로)로 이동 후 git clone https://github.com/kmg28801/yes23.git

명령어 수행을 통해 cloud 서버에 개발한 프로젝트를 clone

git clone https://github.com/GunheeYoun/sharing23.git

 

9.  clone이 완료되었다면, 각 서비스 폴더로 들어가서 mvn package 로 메이븐 빌드 수행

 

10. docker image 빌드

docker build -t sharing23.azurecr.io/delivery:v1 .

docker build -t sharing23.azurecr.io/cancel:v1 .

docker build -t sharing23.azurecr.io/gateway:v1 .

docker build -t sharing23.azurecr.io/mypage:v1 .

docker build -t sharing23.azurecr.io/order:v1 .

docker build -t yes23.azurecr.io/pay:v1 .

 

11. docker image push    ===> 클라우드계정에 업로드

docker push sharing24.azurecr.io/delivery:v1

docker push sharing24.azurecr.io/cancel:v1

docker push sharing24.azurecr.io/gateway:v1

docker push sharing24.azurecr.io/mypage:v1

docker push sharing24.azurecr.io/order:v1

docker push sharing24.azurecr.io/pay:v1

 

//

12. acr에 image를 push  클라우드계정에 있는 이미지 빌드

az acr build --registry sharing24 --image sharing24.azurecr.io/delivery:v1 .

az acr build --registry sharing24 --image sharing24.azurecr.io/gateway:v1 .

az acr build --registry sharing24 --image sharing24.azurecr.io/mypage:v1 .

az acr build --registry sharing24 --image sharing24.azurecr.io/order:v1 .

az acr build --registry sharing24 --image sharing24.azurecr.io/delivery:v1 .

 

//

 

 

kubectl create namespace sharingnow 

 

kubectl create deploy delivery --image=sharing24.azurecr.io/delivery:v1 

 

 

((수정한 소스들이있다면 9번부터 다시 수행))

 

 

 

헬름이 설치가 안되어 있거나, 버전이 2.xx 일때 카프카 설치 방법

 

 

curl https://raw.githubusercontent.com/kubernetes/helm/master/scripts/get | bash

kubectl --namespace kube-system create sa tiller      # helm 의 설치관리자를 위한 시스템 사용자 생성

kubectl create clusterrolebinding tiller --clusterrole cluster-admin --serviceaccount=kube-system:tiller

helm init --service-account tiller

 

kubectl patch deploy --namespace kube-system tiller-deploy -p '{"spec":{"template":{"spec":{"serviceAccount":"tiller"}}}}'

 

helm repo add incubator http://storage.googleapis.com/kubernetes-charts-incubator

helm repo update

helm install --name my-kafka --namespace kafka incubator/kafka

 

==> yml 파일의 destination으로 되어있는 이름으로 토픽 생성

 

 

 

카프카 설치

curl https://raw.githubusercontent.com/kubernetes/helm/master/scripts/get | bash

kubectl --namespace kube-system create sa tiller 

kubectl create clusterrolebinding tiller --clusterrole cluster-admin --serviceaccount=kube-system:tiller

helm init --service-account tiller

kubectl patch deploy --namespace kube-system tiller-deploy -p '{"spec":{"template":{"spec":{"serviceAccount":"tiller"}}}}'

helm repo add incubator http://storage.googleapis.com/kubernetes-charts-incubator

helm repo update

helm install --name my-kafka --namespace kafka incubator/kafka

 

 

==> yml 파일의 destination으로 되어있는 이름으로 토픽 생성

 

 

 

(필수아님 - circit breaker 등)

Istio 설치  ==> 일단은 설정 안하는걸로

 

httpie 설치

 

cat <<EOF | kubectl apply -f -

apiVersion: "v1"

kind: "Pod"

metadata: 

  name: httpie

  namespace: tutorial

  labels: 

    name: httpie

spec: 

  containers: 

    - name: httpie

      image: clue/httpie

      command:

        - sleep

        - "360000"

EOF

 

 

==================================================랩실에서 진행해야 할 작업

 

 
