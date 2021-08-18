
git init

git remote add origin https://github.com/adrianoand95/java-completo-poo.git

git pull origin main

// git checkout -b main

git add .

git commit -m "Projeto criado"

git push -u origin main


// Preciso apagar o último commit no Github:
git push -f origin HEAD^:main

// Preciso remover o último commit no Git, porém mantendo os arquivos do jeito que estão:
git reset --soft HEAD~1
