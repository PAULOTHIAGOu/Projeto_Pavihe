/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

/**
 *
 * @author 823111853
 */
public class Tela7Ajuda extends javax.swing.JInternalFrame {

    /**
     */
    public Tela7Ajuda() {
     
        initComponents();
 
    
    jTextArea1.setEditable(false);
    jTextArea1.setText("Bem-vindo à tela de ajuda do Portal do Aluno.\n" +
" Abaixo estão algumas informações úteis sobre as principais funcionalidades do  sistema:\n" +
"\n" +
"Tela de Login:\n" +
"Nesta tela, você deve inserir suas credenciais de acesso (userID e senha,\n" +
"fornecidos apos realizar o primeiro acesso) para acessar o sistema.\n" +
"\n" +
"Tela de Primeiro Acesso:\n" +
"Caso seja seu primeiro acesso, você será redirecionado para esta tela.\n" +
" É necessário preencher algumas informações para criar  a sua conta.\n" +
"\n" +
"Tela de Recuperação de Senha:\n" +
"Se você esqueceu sua senha, clique no link \"Esqueceu sua senha?\" na tela de login.\n" +
" Você será direcionado para esta tela, para redefinir senha,apos confirmar algumas informações\n" +
"\n" +
"Tela de Gerenciar Aluno:\n" +
"Nesta tela, os professores podem lançar notas para os alunos e verificar informações\n" +
"sobre a turma em que o aluno está matriculado.\n" +
"\n" +
"Tela de Status do Aluno:\n" +
"Aqui, você pode digitar a ID do aluno para visualizar suas notas, \n" +
"informações de contato (como e-mail e telefone) e se o aluno foi aprovado ou não.\n" +
" \n" +
"Tela de Editar Perfil:\n" +
"Nesta tela, você pode atualizar seu e-mail de cadastro, número de telefone\n" +
" e também fazer o upload de uma foto de perfil.\n" +
".");
    
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(554, 390));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(4);
        jTextArea1.setText("Bem-vindo à tela de ajuda do Portal do Aluno.\n Abaixo estão algumas informações úteis sobre as principais funcionalidades do  sistema:\n\nTela de Login:\nNesta tela, você deve inserir suas credenciais de acesso (userID e senha,\nfornecidos apos realizar o primeiro acesso) para acessar o sistema.\n\nTela de Primeiro Acesso:\nCaso seja seu primeiro acesso, você será redirecionado para esta tela.\n É necessário preencher algumas informações para criar  a sua conta.\n\nTela de Recuperação de Senha:\nSe você esqueceu sua senha, clique no link \"Esqueceu sua senha?\" na tela de login.\n Você será direcionado para esta tela, para redefinir senha,apos confirmar algumas informações\n\nTela de Gerenciar Aluno:\nNesta tela, os professores podem lançar notas para os alunos e verificar informações\nsobre a turma em que o aluno está matriculado.\n\nTela de Status do Aluno:\nAqui, você pode digitar a ID do aluno para visualizar suas notas, \ninformações de contato (como e-mail e telefone) e se o aluno foi aprovado ou não.\n \nTela de Editar Perfil:\nNesta tela, você pode atualizar seu e-mail de cadastro, número de telefone\n e também fazer o upload de uma foto de perfil.\n");
        jTextArea1.setPreferredSize(new java.awt.Dimension(520, 440));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
