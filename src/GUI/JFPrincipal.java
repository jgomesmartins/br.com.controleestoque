package GUI;

import Entidade.Proxy;
import Classes.ReportView;
import Fachada.FacConfiguracao;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author GOMES
 */
public class JFPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFPrincipal
     */
    public static JButton jbmenusel;
    public static Fachada.FacConfiguracao faconf;

    public static ReportView reportShow = new ReportView();
    
    Color colorsel;
    public JFPrincipal() {
        initComponents();
        JFPrincipal.faconf = new FacConfiguracao();
        JFPrincipal.CarregaConfiguracoes();
        jbmenusel = new JButton();
        Color c = JFPrincipal.JPMainTop.getBackground();
        colorsel = new Color((c.getRed()), c.getGreen()+20, c.getBlue());
        
        for (Component object : JFPrincipal.JPMainTop.getComponents()) {
            object.setBackground(c);
        }
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPMainTop = new javax.swing.JPanel();
        JBMenuCadastro = new javax.swing.JButton();
        JBMenuQuilometragem = new javax.swing.JButton();
        JBMenuManutencao = new javax.swing.JButton();
        JBMenuDashboard = new javax.swing.JButton();
        JBMenuTabelaFipe = new javax.swing.JButton();
        JBMenuSobre = new javax.swing.JButton();
        JBMenuConfiguracao = new javax.swing.JButton();
        JBMenuCores = new javax.swing.JButton();
        JPMainContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JPMainTop.setBackground(new java.awt.Color(0, 102, 153));

        JBMenuCadastro.setBackground(new java.awt.Color(0, 102, 153));
        JBMenuCadastro.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JBMenuCadastro.setForeground(new java.awt.Color(255, 255, 255));
        JBMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-formato-40.png"))); // NOI18N
        JBMenuCadastro.setText("CADASTRO");
        JBMenuCadastro.setToolTipText("Manutenção no cadastro do sistema.");
        JBMenuCadastro.setBorderPainted(false);
        JBMenuCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBMenuCadastro.setFocusPainted(false);
        JBMenuCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBMenuCadastro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBMenuCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBMenuCadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBMenuCadastroMouseExited(evt);
            }
        });
        JBMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuCadastroActionPerformed(evt);
            }
        });

        JBMenuQuilometragem.setBackground(new java.awt.Color(0, 102, 153));
        JBMenuQuilometragem.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JBMenuQuilometragem.setForeground(new java.awt.Color(255, 255, 255));
        JBMenuQuilometragem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-velocidade-40.png"))); // NOI18N
        JBMenuQuilometragem.setText("QUILOMETRAGEM");
        JBMenuQuilometragem.setToolTipText("Informar quilometragem do veículo cadastrado.");
        JBMenuQuilometragem.setBorderPainted(false);
        JBMenuQuilometragem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBMenuQuilometragem.setFocusPainted(false);
        JBMenuQuilometragem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBMenuQuilometragem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBMenuQuilometragem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBMenuQuilometragemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBMenuQuilometragemMouseExited(evt);
            }
        });
        JBMenuQuilometragem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuQuilometragemActionPerformed(evt);
            }
        });

        JBMenuManutencao.setBackground(new java.awt.Color(0, 102, 153));
        JBMenuManutencao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JBMenuManutencao.setForeground(new java.awt.Color(255, 255, 255));
        JBMenuManutencao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-manutenção-40.png"))); // NOI18N
        JBMenuManutencao.setText("MANUTENÇÃO");
        JBMenuManutencao.setToolTipText("Informe manutenções realizadas no veículo.");
        JBMenuManutencao.setBorderPainted(false);
        JBMenuManutencao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBMenuManutencao.setFocusPainted(false);
        JBMenuManutencao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBMenuManutencao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBMenuManutencao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBMenuManutencaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBMenuManutencaoMouseExited(evt);
            }
        });
        JBMenuManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuManutencaoActionPerformed(evt);
            }
        });

        JBMenuDashboard.setBackground(new java.awt.Color(0, 102, 153));
        JBMenuDashboard.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JBMenuDashboard.setForeground(new java.awt.Color(255, 255, 255));
        JBMenuDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-painel-de-controle-40.png"))); // NOI18N
        JBMenuDashboard.setText("DASHBOARD");
        JBMenuDashboard.setToolTipText("Visualização das situação atual do veículo.");
        JBMenuDashboard.setBorderPainted(false);
        JBMenuDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBMenuDashboard.setFocusPainted(false);
        JBMenuDashboard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBMenuDashboard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBMenuDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBMenuDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBMenuDashboardMouseExited(evt);
            }
        });
        JBMenuDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuDashboardActionPerformed(evt);
            }
        });

        JBMenuTabelaFipe.setBackground(new java.awt.Color(0, 102, 153));
        JBMenuTabelaFipe.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JBMenuTabelaFipe.setForeground(new java.awt.Color(255, 255, 255));
        JBMenuTabelaFipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/imagem-tabela-fipe1.jpg"))); // NOI18N
        JBMenuTabelaFipe.setText("TABELA FIPE");
        JBMenuTabelaFipe.setToolTipText("Consultar tabela FIPE On line.");
        JBMenuTabelaFipe.setBorderPainted(false);
        JBMenuTabelaFipe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBMenuTabelaFipe.setFocusPainted(false);
        JBMenuTabelaFipe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBMenuTabelaFipe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBMenuTabelaFipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBMenuTabelaFipeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBMenuTabelaFipeMouseExited(evt);
            }
        });
        JBMenuTabelaFipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuTabelaFipeActionPerformed(evt);
            }
        });
        JBMenuTabelaFipe.setVisible(false);

        JBMenuSobre.setBackground(new java.awt.Color(0, 102, 153));
        JBMenuSobre.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        JBMenuSobre.setForeground(new java.awt.Color(255, 255, 255));
        JBMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-sobre-24 (1).png"))); // NOI18N
        JBMenuSobre.setToolTipText("Sobre a ferramenta");
        JBMenuSobre.setBorderPainted(false);
        JBMenuSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBMenuSobre.setFocusPainted(false);
        JBMenuSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBMenuSobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBMenuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBMenuSobreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBMenuSobreMouseExited(evt);
            }
        });
        JBMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuSobreActionPerformed(evt);
            }
        });

        JBMenuConfiguracao.setBackground(new java.awt.Color(0, 102, 153));
        JBMenuConfiguracao.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        JBMenuConfiguracao.setForeground(new java.awt.Color(255, 255, 255));
        JBMenuConfiguracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-engrenagem-24 (2).png"))); // NOI18N
        JBMenuConfiguracao.setToolTipText("Configurações da ferramenta.");
        JBMenuConfiguracao.setBorderPainted(false);
        JBMenuConfiguracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBMenuConfiguracao.setFocusPainted(false);
        JBMenuConfiguracao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBMenuConfiguracao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBMenuConfiguracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBMenuConfiguracaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBMenuConfiguracaoMouseExited(evt);
            }
        });
        JBMenuConfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuConfiguracaoActionPerformed(evt);
            }
        });

        JBMenuCores.setBackground(new java.awt.Color(0, 102, 153));
        JBMenuCores.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        JBMenuCores.setForeground(new java.awt.Color(255, 255, 255));
        JBMenuCores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-paleta-de-cores-24.png"))); // NOI18N
        JBMenuCores.setToolTipText("Seletor de cores");
        JBMenuCores.setBorderPainted(false);
        JBMenuCores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBMenuCores.setFocusPainted(false);
        JBMenuCores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBMenuCores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBMenuCores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBMenuCoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBMenuCoresMouseExited(evt);
            }
        });
        JBMenuCores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuCoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPMainTopLayout = new javax.swing.GroupLayout(JPMainTop);
        JPMainTop.setLayout(JPMainTopLayout);
        JPMainTopLayout.setHorizontalGroup(
            JPMainTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMainTopLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(JBMenuCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBMenuQuilometragem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBMenuManutencao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBMenuDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBMenuTabelaFipe, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBMenuCores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBMenuConfiguracao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBMenuSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPMainTopLayout.setVerticalGroup(
            JPMainTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMainTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPMainTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBMenuTabelaFipe, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBMenuCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBMenuDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPMainTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JBMenuQuilometragem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addComponent(JBMenuManutencao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPMainTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPMainTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBMenuCores)
                    .addComponent(JBMenuConfiguracao)
                    .addComponent(JBMenuSobre))
                .addContainerGap())
        );

        JPMainContent.setAutoscrolls(true);

        javax.swing.GroupLayout JPMainContentLayout = new javax.swing.GroupLayout(JPMainContent);
        JPMainContent.setLayout(JPMainContentLayout);
        JPMainContentLayout.setHorizontalGroup(
            JPMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1188, Short.MAX_VALUE)
        );
        JPMainContentLayout.setVerticalGroup(
            JPMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPMainTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPMainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPMainTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPMainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1224, 783));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuCadastroActionPerformed

        JPCadastro jpcad = new JPCadastro();

        JFPrincipal.setPanelMain(jpcad);

        this.setUndelineButton(JBMenuCadastro);


    }//GEN-LAST:event_JBMenuCadastroActionPerformed

    private void JBMenuCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuCadastroMouseEntered

        JBMenuCadastro.setFont(FontUnderline.setUnderlineOn(JBMenuCadastro.getFont()));
       JBMenuCadastro.setBackground(this.colorsel);
    }//GEN-LAST:event_JBMenuCadastroMouseEntered

    private void JBMenuCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuCadastroMouseExited

        if (JBMenuCadastro.getText() == null ? JFPrincipal.jbmenusel.getText() != null : !JBMenuCadastro.getText().equals(JFPrincipal.jbmenusel.getText())) {
            JBMenuCadastro.setFont(FontUnderline.setUnderlineOff(JBMenuCadastro.getFont()));
        }

        JBMenuCadastro.setBackground(JFPrincipal.JPMainTop.getBackground());
    }//GEN-LAST:event_JBMenuCadastroMouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        JPHome jphome = new JPHome();
        JFPrincipal.setPanelMain(jphome);
    }//GEN-LAST:event_formWindowOpened

    private void JBMenuQuilometragemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuQuilometragemMouseEntered

        JBMenuQuilometragem.setFont(FontUnderline.setUnderlineOn(JBMenuQuilometragem.getFont()));

        JBMenuQuilometragem.setBackground(this.colorsel);
    }//GEN-LAST:event_JBMenuQuilometragemMouseEntered

    private void JBMenuQuilometragemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuQuilometragemMouseExited

        if (JBMenuQuilometragem != JFPrincipal.jbmenusel) {
            JBMenuQuilometragem.setFont(FontUnderline.setUnderlineOff(JBMenuQuilometragem.getFont()));
        }

        JBMenuQuilometragem.setBackground(JFPrincipal.JPMainTop.getBackground());
    }//GEN-LAST:event_JBMenuQuilometragemMouseExited

    private void JBMenuQuilometragemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuQuilometragemActionPerformed
        try {
            JFPrincipal.setPanelMain(new JPQuilometragem());
            this.setUndelineButton(JBMenuQuilometragem);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBMenuQuilometragemActionPerformed

    private void JBMenuManutencaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuManutencaoMouseEntered

        JBMenuManutencao.setFont(FontUnderline.setUnderlineOn(JBMenuManutencao.getFont()));

        JBMenuManutencao.setBackground(this.colorsel);
    }//GEN-LAST:event_JBMenuManutencaoMouseEntered

    private void JBMenuManutencaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuManutencaoMouseExited

        if (JBMenuManutencao != JFPrincipal.jbmenusel) {
            JBMenuManutencao.setFont(FontUnderline.setUnderlineOff(JBMenuManutencao.getFont()));
        }

        JBMenuManutencao.setBackground(JFPrincipal.JPMainTop.getBackground());
    }//GEN-LAST:event_JBMenuManutencaoMouseExited

    private void JBMenuManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuManutencaoActionPerformed
        JPManutencao jpman = new JPManutencao();
        JFPrincipal.setPanelMain(jpman);

        this.setUndelineButton(JBMenuManutencao);
    }//GEN-LAST:event_JBMenuManutencaoActionPerformed

    private void JBMenuDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuDashboardMouseEntered

        JBMenuDashboard.setFont(FontUnderline.setUnderlineOn(JBMenuDashboard.getFont()));

        JBMenuDashboard.setBackground(this.colorsel);
    }//GEN-LAST:event_JBMenuDashboardMouseEntered

    private void JBMenuDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuDashboardMouseExited

        if (JBMenuDashboard != JFPrincipal.jbmenusel) {
            JBMenuDashboard.setFont(FontUnderline.setUnderlineOff(JBMenuDashboard.getFont()));
        }

        JBMenuDashboard.setBackground(JFPrincipal.JPMainTop.getBackground());
    }//GEN-LAST:event_JBMenuDashboardMouseExited

    private void JBMenuDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuDashboardActionPerformed
        JPDashboard jpman = new JPDashboard();
        JFPrincipal.setPanelMain(jpman);

        this.setUndelineButton(JBMenuDashboard);
    }//GEN-LAST:event_JBMenuDashboardActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged


    }//GEN-LAST:event_formWindowStateChanged

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized

        if (JPMainContent.getComponentCount() > 0) {

            JPMainContent.getComponent(0).setSize(JPMainContent.getWidth(), JPMainContent.getHeight());
            JPMainContent.getComponent(0).doLayout();
            JPMainContent.getComponent(0).repaint();

            for (int i = 0; i < JPMainContent.getComponentCount(); i++) {
                JPMainContent.getComponent(i).doLayout();
                JPMainContent.getComponent(i).repaint();
            }

        }

    }//GEN-LAST:event_formComponentResized

    private void JBMenuTabelaFipeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuTabelaFipeMouseEntered

        JBMenuTabelaFipe.setFont(FontUnderline.setUnderlineOn(JBMenuTabelaFipe.getFont()));

        JBMenuTabelaFipe.setBackground(this.colorsel);
    }//GEN-LAST:event_JBMenuTabelaFipeMouseEntered

    private void JBMenuTabelaFipeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuTabelaFipeMouseExited

        if (JBMenuTabelaFipe != JFPrincipal.jbmenusel) {
            JBMenuTabelaFipe.setFont(FontUnderline.setUnderlineOff(JBMenuTabelaFipe.getFont()));
        }

        JBMenuTabelaFipe.setBackground(JFPrincipal.JPMainTop.getBackground());
    }//GEN-LAST:event_JBMenuTabelaFipeMouseExited

    private void JBMenuTabelaFipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuTabelaFipeActionPerformed

        JPTabelaFipe jpfipe = new JPTabelaFipe();
        JFPrincipal.setPanelMain(jpfipe);
        this.setUndelineButton(JBMenuTabelaFipe);

    }//GEN-LAST:event_JBMenuTabelaFipeActionPerformed

    private void JBMenuSobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuSobreMouseEntered
        JBMenuSobre.setBackground(this.colorsel);
    }//GEN-LAST:event_JBMenuSobreMouseEntered

    private void JBMenuSobreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuSobreMouseExited
        JBMenuSobre.setBackground(JFPrincipal.JPMainTop.getBackground());
    }//GEN-LAST:event_JBMenuSobreMouseExited

    private void JBMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuSobreActionPerformed
        JPSobre jpsobre = new JPSobre();
        JFPrincipal.setPanelMain(jpsobre);
    }//GEN-LAST:event_JBMenuSobreActionPerformed

    private void JBMenuConfiguracaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuConfiguracaoMouseEntered
        JBMenuConfiguracao.setBackground(this.colorsel);
    }//GEN-LAST:event_JBMenuConfiguracaoMouseEntered

    private void JBMenuConfiguracaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuConfiguracaoMouseExited
        JBMenuConfiguracao.setBackground(JFPrincipal.JPMainTop.getBackground());
    }//GEN-LAST:event_JBMenuConfiguracaoMouseExited

    private void JBMenuConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuConfiguracaoActionPerformed
        JPConfiguracao jpconfig = new JPConfiguracao();
        JFPrincipal.setPanelMain(jpconfig);
    }//GEN-LAST:event_JBMenuConfiguracaoActionPerformed

    private void JBMenuCoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuCoresMouseEntered
         JBMenuCores.setBackground(this.colorsel);
    }//GEN-LAST:event_JBMenuCoresMouseEntered

    private void JBMenuCoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMenuCoresMouseExited
      JBMenuCores.setBackground(JFPrincipal.JPMainTop.getBackground());
    }//GEN-LAST:event_JBMenuCoresMouseExited

    private void JBMenuCoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuCoresActionPerformed
        
        Color initialcolor = new Color(0, 102, 153);
        Color color = JColorChooser.showDialog(this, "Selecione a cor.", initialcolor);
      
        
        if (color != null) {                  

            JFPrincipal.JPMainTop.setBackground(color);
                          
            try {
                JFPrincipal.faconf.gravaCorPainel(color);
            } catch (Exception ex) {
                Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        for (Component object : JFPrincipal.JPMainTop.getComponents()) {
            object.setBackground(color);
        }
 
           Color c = color;      
           this.colorsel = new Color(c.getRed(), c.getGreen()+20, c.getBlue());
        }


        
    }//GEN-LAST:event_JBMenuCoresActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      
       // int res =  JOptionPane.showConfirmDialog(JPMainContent, "Deseja realmente sair do sistema?","Sair " + Config.NAME,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        //if (res == JOptionPane.NO_OPTION) {
           this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
       // }else{
       //     this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       // }
       
       
        JPSair jpsair = new JPSair();
        JFPrincipal.setPanelMain(jpsair);
       

    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
               

    }//GEN-LAST:event_formWindowClosed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
 
    }//GEN-LAST:event_formWindowDeactivated

    public static void setPanelMain(JPanel panel) {

        JPMainContent.removeAll();
        panel.setSize(JPMainContent.getWidth(), JPMainContent.getHeight());
        panel.setVisible(true);
        JPMainContent.add(panel);
        JPMainContent.doLayout();
        JPMainContent.repaint();
        panel.doLayout();

        for (int i = 0; i < panel.getComponentCount(); i++) {
            panel.getComponent(i).doLayout();
            panel.getComponent(i).repaint();
        }
       
        if (panel.getName() != null) {
            JFPrincipal.limpaUndeline();
        }        
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton JBMenuCadastro;
    private javax.swing.JButton JBMenuConfiguracao;
    private javax.swing.JButton JBMenuCores;
    public static javax.swing.JButton JBMenuDashboard;
    public static javax.swing.JButton JBMenuManutencao;
    public static javax.swing.JButton JBMenuQuilometragem;
    private javax.swing.JButton JBMenuSobre;
    public static javax.swing.JButton JBMenuTabelaFipe;
    public static javax.swing.JPanel JPMainContent;
    private static javax.swing.JPanel JPMainTop;
    // End of variables declaration//GEN-END:variables

    private void setUndelineButton(JButton bt) {

        JButton[] arrbu = new JButton[5];

        arrbu[0] = JFPrincipal.JBMenuCadastro;
        arrbu[1] = JFPrincipal.JBMenuQuilometragem;
        arrbu[2] = JFPrincipal.JBMenuDashboard;
        arrbu[3] = JFPrincipal.JBMenuTabelaFipe;
        arrbu[4] = JFPrincipal.JBMenuManutencao;
        
        for (JButton jbt : arrbu) {

            if (bt == jbt) {
                JFPrincipal.jbmenusel = bt;
            } else {
                jbt.setFont(FontUnderline.setUnderlineOff(jbt.getFont()));
            }
        }
        
        JFPrincipal.jbmenusel.setFont(FontUnderline.setUnderlineOn(JFPrincipal.jbmenusel.getFont()));

    }

    public static void limpaUndeline(){
    
     JFPrincipal.JBMenuCadastro.setFont(FontUnderline.setUnderlineOff(JFPrincipal.JBMenuCadastro.getFont()));
     JFPrincipal.JBMenuQuilometragem.setFont(FontUnderline.setUnderlineOff(JFPrincipal.JBMenuQuilometragem.getFont()));
     JFPrincipal.JBMenuDashboard.setFont(FontUnderline.setUnderlineOff(JFPrincipal.JBMenuDashboard.getFont()));
     JFPrincipal.JBMenuTabelaFipe.setFont(FontUnderline.setUnderlineOff(JFPrincipal.JBMenuTabelaFipe.getFont()));
     JFPrincipal.JBMenuManutencao.setFont(FontUnderline.setUnderlineOff(JFPrincipal.JBMenuManutencao.getFont()));
     
     JFPrincipal.jbmenusel = new JButton();
     
    }
    
    public static void CarregaConfiguracoes() {

        try {
            
            List<Proxy> listpro = new ArrayList();
            listpro = JFPrincipal.faconf.ConsultarProxy(new Proxy());

            for (Proxy proxy : listpro) {

                if (!(proxy.getHostname() == null)) {

                    System.setProperty("http.proxyHost", proxy.getHostname().toLowerCase());

                }

                if (!(proxy.getPorta() == null)) {
                    System.setProperty("http.proxyPort", proxy.getPorta().toLowerCase());
                }

            }
            
            
            JPMainTop.setBackground(JFPrincipal.faconf.consultaCorPainel());
            
        } catch (Exception ex) {
            
        }
    }
}
