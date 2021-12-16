O projeto desenvolvido consiste em fazer um pequeno sistema distribuído utilizando de sockets onde nesse sistema haverão calculos das 4 operações básicas além de potenciação e radiciação em base 2 e porcentagem.

Instruções de Uso -

Cada valor e operação devem vir separados por " " como por exemplo de uma operação de soma: 10 + 10. Seguindo assim como base para as quatro operações básicas.
Para as demais operações devem seguir o seguinte exemplo: 
	Potenciação exemplo 2 ^ 4, 2 elevado a 4 cujo o resultado é 16.
	Raiz quadrada exemplo 2 V 4, assim sendo representado a raiz quadrada de 4, cujo o resultado é 2.
	Porcentagem exemplo 100 % 10, assim sendo representado 10 por cento de 100, cujo o resultado é 10.

Decisões de Projeto -
Servidor RM1 responsável pelas 4 operações básicas ocorrendo serviços na máquina local - "localhost" sendo utilizada a porta 160 com o nome de serviço remoto como: RM1Server sendo invocado: "rmi://localhost:160/RM1Server"

Servidor RM1 responsável pelas 3 operações restantes (Porcentagem, Radiciação em base 2 e Potenciação) ocorrendo serviços na máquina local - "localhost" sendo utilizada a porta 150 com o nome de serviço remoto como: RM2Server sendo invocado: "rmi://localhost:150/RM2Server"