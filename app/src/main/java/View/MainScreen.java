package View;

import Controller.ProjectController;
import Controller.TaskController;
import Model.Project;
import Model.Task;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import util.ButtonColumnCellRederer;
import util.DeadlineColumnCellRederer;
import util.TaskTableModel;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author MATHEUS
 */
public class MainScreen extends javax.swing.JFrame {    
    
    ProjectController projectController;
    TaskController taskController;
    
    DefaultListModel projectsModel;
    TaskTableModel taskModel;
    
    

    public MainScreen() {
        initComponents();
        initDataController();
        initComponentsModel();
        decorateTableTasks();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEmptyList = new javax.swing.JPanel();
        jLabelEmptyListIcon = new javax.swing.JLabel();
        jLabelEmptyListTitle = new javax.swing.JLabel();
        jLabelEmptyListSubTitle = new javax.swing.JLabel();
        jPanelToolBar = new javax.swing.JPanel();
        jLabelToolBarSubTitle = new javax.swing.JLabel();
        jLabelToolBarTitle = new javax.swing.JLabel();
        jPanelProjects = new javax.swing.JPanel();
        jLabelProjectsTitle = new javax.swing.JLabel();
        jLabelProjectsAdd = new javax.swing.JLabel();
        jPanelTasks = new javax.swing.JPanel();
        jLabelTasksTitle = new javax.swing.JLabel();
        jLabelTasksAdd = new javax.swing.JLabel();
        jPanelProjectsList = new javax.swing.JPanel();
        jScrollPaneProjects = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();
        jPanelTasksList = new javax.swing.JPanel();
        jScrollPaneTasks = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();

        jPanelEmptyList.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEmptyList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelEmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\MARCOS\\Google Drive\\Estudos e Trabalhos\\Programação\\Capgemini\\Introdução\\Materiais Compartilhados\\resources\\lists.png")); // NOI18N

        jLabelEmptyListTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmptyListTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelEmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListTitle.setText("Nenhuma tarefa por aqui");

        jLabelEmptyListSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListSubTitle.setText("Clique no botão \"+\" para adicionar uma nova tarefa");

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmptyListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmptyListSubTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabelEmptyListIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmptyListTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmptyListSubTitle)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));

        jPanelToolBar.setBackground(new java.awt.Color(0, 153, 102));

        jLabelToolBarSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelToolBarSubTitle.setText("Anote tudo, esqueça nada");

        jLabelToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelToolBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelToolBarTitle.setIcon(new javax.swing.ImageIcon("C:\\Users\\MARCOS\\Google Drive\\Estudos e Trabalhos\\Programação\\Capgemini\\Introdução\\Materiais Compartilhados\\resources\\tick.png")); // NOI18N
        jLabelToolBarTitle.setText("App Tarefas");
        jLabelToolBarTitle.setToolTipText("");

        javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
        jPanelToolBar.setLayout(jPanelToolBarLayout);
        jPanelToolBarLayout.setHorizontalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelToolBarSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelToolBarLayout.setVerticalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelToolBarSubTitle)
                .addGap(17, 17, 17))
        );

        jPanelProjects.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProjects.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabelProjectsTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelProjectsTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelProjectsTitle.setText("Projetos");

        jLabelProjectsAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\MARCOS\\Google Drive\\Estudos e Trabalhos\\Programação\\Capgemini\\Introdução\\Materiais Compartilhados\\resources\\add.png")); // NOI18N
        jLabelProjectsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProjectsAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelProjectsLayout = new javax.swing.GroupLayout(jPanelProjects);
        jPanelProjects.setLayout(jPanelProjectsLayout);
        jPanelProjectsLayout.setHorizontalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProjectsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelProjectsAdd)
                .addContainerGap())
        );
        jPanelProjectsLayout.setVerticalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelProjectsAdd)
                    .addComponent(jLabelProjectsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanelTasks.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTasks.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabelTasksTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTasksTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelTasksTitle.setText("Tarefas");

        jLabelTasksAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\MARCOS\\Google Drive\\Estudos e Trabalhos\\Programação\\Capgemini\\Introdução\\Materiais Compartilhados\\resources\\add.png")); // NOI18N
        jLabelTasksAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTasksAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTasksLayout = new javax.swing.GroupLayout(jPanelTasks);
        jPanelTasks.setLayout(jPanelTasksLayout);
        jPanelTasksLayout.setHorizontalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTasksTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTasksAdd)
                .addContainerGap())
        );
        jPanelTasksLayout.setVerticalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTasksAdd)
                    .addComponent(jLabelTasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanelProjectsList.setBackground(new java.awt.Color(255, 255, 255));

        jListProjects.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setFixedCellHeight(50);
        jListProjects.setSelectionBackground(new java.awt.Color(0, 153, 102));
        jListProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProjectsMouseClicked(evt);
            }
        });
        jScrollPaneProjects.setViewportView(jListProjects);

        javax.swing.GroupLayout jPanelProjectsListLayout = new javax.swing.GroupLayout(jPanelProjectsList);
        jPanelProjectsList.setLayout(jPanelProjectsListLayout);
        jPanelProjectsListLayout.setHorizontalGroup(
            jPanelProjectsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjects)
                .addContainerGap())
        );
        jPanelProjectsListLayout.setVerticalGroup(
            jPanelProjectsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTasksList.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTasksList.setLayout(new java.awt.BorderLayout());

        jTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTasks.setRowHeight(40);
        jTableTasks.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        jScrollPaneTasks.setViewportView(jTableTasks);

        jPanelTasksList.add(jScrollPaneTasks, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelProjectsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTasksList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjectsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTasksList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelProjectsAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProjectsAddMouseClicked
        // TODO add your handling code here:
        ProjectsDialogScreen projectsDialogScreen = new ProjectsDialogScreen(this, rootPaneCheckingEnabled);
        projectsDialogScreen.setVisible(true);
        
        projectsDialogScreen.addWindowListener(new WindowAdapter(){
            public void windowClosed(WindowEvent e){
                loadProjects();
            }
        });
    }//GEN-LAST:event_jLabelProjectsAddMouseClicked

    private void jLabelTasksAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTasksAddMouseClicked
        // TODO add your handling code here:
        TasksDialogScreen taskDialogScreen = new TasksDialogScreen(this, rootPaneCheckingEnabled);
        int projectIndex = jListProjects.getSelectedIndex();
        
        //Project project = (Project) projectsModel.get(jListProjects.getSelectedIndex());
        Project project = (Project) projectsModel.get(projectIndex);
        taskDialogScreen.setProject(project);
        
        taskDialogScreen.setVisible(true);
        
        taskDialogScreen.addWindowListener(new WindowAdapter(){
            public void windowClosed(WindowEvent e){
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
            }
        });
        
    }//GEN-LAST:event_jLabelTasksAddMouseClicked

    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        // TODO add your handling code here:
        int rowIndex = jTableTasks.rowAtPoint(evt.getPoint());
        int columnIndex = jTableTasks.columnAtPoint(evt.getPoint());
        Task task = taskModel.getTasks().get(rowIndex);
        
        switch(columnIndex){
            case 3:
                taskController.update(task);
                break;
            
            case 4:
                break;
            
            case 5:
                taskController.removeById(task.getId());
                taskModel.getTasks().remove(task);
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
                
                break;
            
        }
    }//GEN-LAST:event_jTableTasksMouseClicked

    private void jListProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProjectsMouseClicked
        // TODO add your handling code here:
        int projectIndex = jListProjects.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        loadTasks(project.getId());
        
    }//GEN-LAST:event_jListProjectsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelEmptyListIcon;
    private javax.swing.JLabel jLabelEmptyListSubTitle;
    private javax.swing.JLabel jLabelEmptyListTitle;
    private javax.swing.JLabel jLabelProjectsAdd;
    private javax.swing.JLabel jLabelProjectsTitle;
    private javax.swing.JLabel jLabelTasksAdd;
    private javax.swing.JLabel jLabelTasksTitle;
    private javax.swing.JLabel jLabelToolBarSubTitle;
    private javax.swing.JLabel jLabelToolBarTitle;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JPanel jPanelProjects;
    private javax.swing.JPanel jPanelProjectsList;
    private javax.swing.JPanel jPanelTasks;
    private javax.swing.JPanel jPanelTasksList;
    private javax.swing.JPanel jPanelToolBar;
    private javax.swing.JScrollPane jScrollPaneProjects;
    private javax.swing.JScrollPane jScrollPaneTasks;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables

    public void decorateTableTasks(){
        //Customizando o header da tabela de tarefas
        jTableTasks.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTableTasks.getTableHeader().setBackground(new Color(0,153,102));
        jTableTasks.getTableHeader().setForeground(new Color(255, 255, 255));
        
        jTableTasks.getColumnModel().getColumn(2)
                .setCellRenderer(new DeadlineColumnCellRederer());
        
        jTableTasks.getColumnModel().getColumn(4).setCellRenderer(
                new ButtonColumnCellRederer("edit"));
        
        jTableTasks.getColumnModel().getColumn(5).setCellRenderer(
                new ButtonColumnCellRederer("delete"));
        
        
        //Criando um sort automático para as colunas
        jTableTasks.setAutoCreateRowSorter(true);
        
    }
    
    public void initDataController(){
        projectController = new ProjectController();
        taskController = new TaskController();
    }
    
    public void initComponentsModel(){
        projectsModel = new DefaultListModel();
        loadProjects();
        
        taskModel = new TaskTableModel();
        jTableTasks.setModel(taskModel);
        
        if(!projectsModel.isEmpty()){
            jListProjects.setSelectedIndex(0);
            Project project = (Project) projectsModel.get(0);
            loadTasks(project.getId());
        }
        
    }
    
    public void showJTableTasks(boolean hasTasks){
        if(hasTasks){
            if(jPanelEmptyList.isVisible()){
                jPanelEmptyList.setVisible(false);
                jPanelTasksList.remove(jPanelEmptyList);
            }
            
            jPanelTasksList.add(jScrollPaneTasks);
            jScrollPaneTasks.setVisible(true);
            jScrollPaneTasks.setSize(jPanelTasksList.getWidth(), jPanelTasksList.getHeight());
            
        } else {
            if(jScrollPaneTasks.isVisible()){
                jScrollPaneTasks.setVisible(false);
                jPanelTasksList.remove(jScrollPaneTasks);
            }
            
            jPanelTasksList.add(jPanelEmptyList);
            jPanelEmptyList.setVisible(true);
            jPanelEmptyList.setSize(jPanelTasksList.getWidth(), jPanelTasksList.getHeight());
        }
    }
    
    public void loadTasks(int idProject){
        List<Task> tasks = taskController.getAll(idProject);
        taskModel.setTasks(tasks);
        showJTableTasks(!tasks.isEmpty());
    }
    
    public void loadProjects(){
        List<Project> projects = projectController.getAll();
        
        projectsModel.clear();
        
        for(int i = 0; i < projects.size(); i++)
        {
            Project project = projects.get(i);
            projectsModel.addElement(project);            
        }
        
        jListProjects.setModel(projectsModel);
    }

}
