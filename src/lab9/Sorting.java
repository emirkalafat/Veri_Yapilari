package lab9;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;


public class Sorting extends javax.swing.JFrame {

    /**
     * Creates new form Sorting
     */
    int[] array;
    DefaultListModel dlm = new DefaultListModel();
    DefaultListModel dlm2 = new DefaultListModel();

    public Sorting() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        SelectionSort = new javax.swing.JRadioButton();
        InsertionSort = new javax.swing.JRadioButton();
        BubbleSort = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        MergeSort = new javax.swing.JRadioButton();
        QuickSort = new javax.swing.JRadioButton();
        CountingSort = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(SelectionSort);
        SelectionSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SelectionSort.setText("Selection Sort");
        SelectionSort.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SelectionSortItemStateChanged(evt);
            }
        });
        SelectionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectionSortActionPerformed(evt);
            }
        });

        buttonGroup1.add(InsertionSort);
        InsertionSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        InsertionSort.setText("Insertion Sort");
        InsertionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertionSortActionPerformed(evt);
            }
        });

        buttonGroup1.add(BubbleSort);
        BubbleSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BubbleSort.setText("Bubble Sort");
        BubbleSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BubbleSortActionPerformed(evt);
            }
        });

        jButton1.setText("Generate Random Array");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(MergeSort);
        MergeSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MergeSort.setText("Merge Sort");
        MergeSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MergeSortActionPerformed(evt);
            }
        });

        buttonGroup1.add(QuickSort);
        QuickSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        QuickSort.setText("Quick Sort");
        QuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuickSortActionPerformed(evt);
            }
        });

        buttonGroup1.add(CountingSort);
        CountingSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CountingSort.setText("Counting Sort");
        CountingSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountingSortActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"43", "653", "23", "66", "236", "76", " "};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"23", "43", "66", "76", "236", "653"};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel5.setText("Array Length: ");

        jButton2.setText("Sort");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Total Time");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(CountingSort)
                                                        .addComponent(QuickSort)
                                                        .addComponent(InsertionSort)
                                                        .addComponent(SelectionSort)
                                                        .addComponent(BubbleSort)
                                                        .addComponent(MergeSort))
                                                .addGap(71, 71, 71)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jButton2))
                                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1)
                                                        .addComponent(jLabel5)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton2)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(SelectionSort)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(InsertionSort)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(BubbleSort)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(MergeSort)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(QuickSort)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(CountingSort))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane2)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2)))
                                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectionSortActionPerformed
        int[] arraytemp = array.clone();
        long t1 = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (arraytemp[minIndex] > arraytemp[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arraytemp[i];
                arraytemp[i] = arraytemp[minIndex];
                arraytemp[minIndex] = temp;
            }
        }
        long t2 = System.nanoTime();
        System.out.println(t1);
        System.out.println(t2);
        jLabel2.setText((t2 - t1) / 1000000.0 + "");
        printSortedList(arraytemp);
    }//GEN-LAST:event_SelectionSortActionPerformed

    private void InsertionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertionSortActionPerformed
        int[] arraytemp = array.clone();
        long t1 = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            int key = arraytemp[i];

            int j = i - 1;
            while (j >= 0 && key < arraytemp[j]) {
                arraytemp[j + 1] = arraytemp[j];
                j--;
            }
            arraytemp[j + 1] = key;
        }
        long t2 = System.nanoTime();
        jLabel2.setText((t2 - t1) / 1000000.0 + "");
        printSortedList(arraytemp);
    }//GEN-LAST:event_InsertionSortActionPerformed

    private void BubbleSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BubbleSortActionPerformed
        int[] arraytemp = array.clone();
        long t1 = System.nanoTime();
        for (int i = 1; i < arraytemp.length; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arraytemp.length - i; j++) {
                if (arraytemp[j] > arraytemp[j + 1]) {
                    int temp = arraytemp[j];
                    arraytemp[j] = arraytemp[j + 1];
                    arraytemp[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        long t2 = System.nanoTime();
        jLabel2.setText((t2 - t1) / 1000000.0 + "");
        printSortedList(arraytemp);
    }//GEN-LAST:event_BubbleSortActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        array = new int[Integer.valueOf(jTextField1.getText())];
        dlm.clear();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (1001) + 1);
            dlm.addElement(array[i]);
        }
        jList1.setModel(dlm);

    }//GEN-LAST:event_jButton1ActionPerformed

    void printSortedList(int[] array2) {
        dlm2.clear();
        for (int eleman : array2) {
            dlm2.addElement(eleman);
        }
        jList2.setModel(dlm2);
    }

    private void SelectionSortItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SelectionSortItemStateChanged


    }//GEN-LAST:event_SelectionSortItemStateChanged

    void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[m - l + 1];
        int[] R = new int[r - m];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + i + 1];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                ;
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private void MergeSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MergeSortActionPerformed
        int[] arraytemp = array.clone();
        long t1 = System.nanoTime();
        mergeSort(arraytemp, 0, array.length - 1);
        long t2 = System.nanoTime();
        jLabel2.setText((t2 - t1) / 1000000.0 + "");
        printSortedList(arraytemp);

    }//GEN-LAST:event_MergeSortActionPerformed

    private void QuickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuickSortActionPerformed

    }//GEN-LAST:event_QuickSortActionPerformed

    private void CountingSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountingSortActionPerformed
        long t1 = System.nanoTime();
        int[] output = new int[array.length];
        int[] count = new int[1001];

        for (int i = 0; i < array.length; i++) {
            ++count[array[i]];
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            --count[array[i]];
        }
        long t2 = System.nanoTime();
        jLabel2.setText((t2 - t1) / 1000000.0 + "");
        printSortedList(output);
    }//GEN-LAST:event_CountingSortActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BubbleSort;
    private javax.swing.JRadioButton CountingSort;
    private javax.swing.JRadioButton InsertionSort;
    private javax.swing.JRadioButton MergeSort;
    private javax.swing.JRadioButton QuickSort;
    private javax.swing.JRadioButton SelectionSort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}