### Single Responsability / Responsabilidade Única

<p>Esse principio visa garantir a atribuição de uma unica responsabilidade ao trecho de codigo, para que facilite a escalabilidade do projeto, além de que caso seja necessário atualizar algo dentro do codigo, só se precise alterar uma ou poucas partes do codigo.</p>
<p>Nesta branch está o código que não segue ao principio de Responsabilidade Unica (Single Responsability), visto que existem dois metodos ("validateAndWithdrawl" e "validateAndDeposit") que possuem duas responsabilidades, onde deveria existir um metodo que valida e outro que faz a operação desejada.</p>
