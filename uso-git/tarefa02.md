1. git config --local user.email "joaovitoralves2009@hotmail.com"<br>
git config --local user.name "João Vitor"<br>

3. mkdir cs-aulagit

4. git init

5. ls -la

6. rm -rf .git

7. git init

8. vim cs.txt<br>
	"João Vitor"<br>
	ESC<br>
	:wq<br>
	
9. git status

10. git stage cs.txt <br>
git status<br>

11. git commit -m "Arquivo cs.txt criado com o meu nome"

12. git status

13. git ls-files

14. vim cs.txt<br>
	"construção de software"<br>
	ESC<br>
	:wq<br>
	
15. vim engenharia-software.txt<br>
git status<br>

16. git ls-files

17. git add .

18. git reset cs.txt

19. git status

20. vim cs.txt<br>
	"INF - Instituto de Informática"<br>
	ESC<br>
	:wq<br>
git add cs.txt<br>

21. git commit -m "Definição do Curso de Engenharia de Software do INF"

22. git log

23. git log cs.txt

24. vim cs.txt<br>
	"UFG - Universidade Federal de Goiás"<br>
	ESC<br>
	:wq<br>

25. git diff cs.txt

26. git add cs.txt

27. git reset cs.txt

28. git add cs.txt<br>
git commit -m "Treino"<br>

29. git branch

30. git checkout -b develop

31. git branch

32. vim engenharia-software.txt<br>
	"3200h"<br>
	ESC<br>
	:wq<br>

33. vim estudo.git.txt<br>
	"o git status verifica os arquivos que estão sendo monitorados ou nao pelo git"<br>
	ESC<br>
	:wq<br>
	
34. git status

35. git add .

36. git checkout master

37. git ls-files

38. git diff

39. git branch master

40. git merge develop

41. git branch -D develop

42. git branch
