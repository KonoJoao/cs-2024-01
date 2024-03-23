git config --local user.email "joaovitoralves2009@hotmail.com"
git config --local user.name "João Vitor"

mkdir cs-aulagit

git init

ls -la

rm -rf .git

git init

vim cs.txt
	"João Vitor"
	ESC
	:wq
	
git status

git stage cs.txt
git status

git commit -m "Arquivo cs.txt criado com o meu nome"

git status

git ls-files

vim cs.txt
	"construção de software"
	ESC
	:wq
	
vim engenharia-software.txt
git status

git ls-files

git add .

git reset cs.txt

git status

vim cs.txt
	"INF - Instituto de Informática"
	ESC
	:wq
git add cs.txt

git commit -m "Definição do Curso de Engenharia de Software do INF"

git log

git log cs.txt

vim cs.txt
	"UFG - Universidade Federal de Goiás"
	ESC
	:wq

git diff cs.txt

git add cs.txt

git reset cs.txt

git add cs.txt
git commit -m "Treino"

git branch

git checkout -b develop

git branch

vim engenharia-software.txt
	"3200h"
	ESC
	:wq

vim estudo.git.txt
	"o git status verifica os arquivos que estão sendo monitorados ou nao pelo git"
	ESC
	:wq
	
git status

git add .

git checkout master

git ls-files

git diff

git branch master

git merge develop

git branch -D develop

git branch
