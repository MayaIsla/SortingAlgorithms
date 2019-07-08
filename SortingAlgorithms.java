import java.util.Random;


public class SortingAlgorithms extends javax.swing.JFrame {


	private static int range;
    private final int MAX = 100000; //10000 variables to be sorted
    private final int MIN = 100;
    Random rand = new Random();
    private Integer[] integerArray  = new Integer[MAX];
    private long startTime, stopTime, totalTime; //different times to setDefault time

    public SortingAlgorithms()
    {
        components_GUI();
        this.getRootPane().setDefaultButton(createJButton);
        setLocationRelativeTo(null);
        binarySearch();
    }

    private void components_GUI() { //different components for gui such as the package for java

        sortingButtonGroup = new javax.swing.ButtonGroup();
        searchingButtonGroup = new javax.swing.ButtonGroup();
        originalJPanel = new javax.swing.JPanel();
        originalJScrollPane = new javax.swing.JScrollPane();
        originalJList = new javax.swing.JList();
        originalJLabel = new javax.swing.JLabel();
        sortingAlgorithmJPanel = new javax.swing.JPanel();
        sortingAlgorithmlJLabel = new javax.swing.JLabel();
        sortingJPanel = new javax.swing.JPanel();
        bubbleJRadioButton = new javax.swing.JRadioButton();
        selectionJRadioButton = new javax.swing.JRadioButton();
        insertionJRadioButton = new javax.swing.JRadioButton();
        quickJRadioButton = new javax.swing.JRadioButton();
        mergeJRadioButton = new javax.swing.JRadioButton();
        heapJRadioButton = new javax.swing.JRadioButton();
        searchingJPanel = new javax.swing.JPanel();
        linearJRadioButton = new javax.swing.JRadioButton();
        linearJTextField = new javax.swing.JTextField();
        binaryJRadioButton = new javax.swing.JRadioButton();
        binaryJTextField = new javax.swing.JTextField();
        timeJLabel = new javax.swing.JLabel();
        timeJTextField = new javax.swing.JTextField();
        searchingAlgorithmlJLabel = new javax.swing.JLabel();
        sortedJPanel = new javax.swing.JPanel();
        sortedJScrollPane = new javax.swing.JScrollPane();
        sortedJList = new javax.swing.JList();
        sortedJLabel = new javax.swing.JLabel();
        controlJPanel = new javax.swing.JPanel();
        createJButton = new javax.swing.JButton();
        sortJButton = new javax.swing.JButton();
        createJButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //exit option

        originalJScrollPane.setViewportView(originalJList);

        originalJLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        originalJLabel.setText("Original Values:");

		javax.swing.GroupLayout originalJPanelLayout = new javax.swing.GroupLayout(originalJPanel);
		originalJPanel.setLayout(originalJPanelLayout);
		originalJPanelLayout.setHorizontalGroup(
		originalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(originalJPanelLayout.createSequentialGroup()
		.addGroup(originalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, originalJPanelLayout.createSequentialGroup()
		.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		.addComponent(originalJLabel))
		.addGroup(originalJPanelLayout.createSequentialGroup()
		.addGap(18, 18, 18)
		.addComponent(originalJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
		.addGap(0, 0, Short.MAX_VALUE)))
		.addContainerGap())
        );


		originalJPanelLayout.setVerticalGroup(
		originalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(originalJPanelLayout.createSequentialGroup()
		.addContainerGap()
		.addComponent(originalJLabel)
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		.addComponent(originalJScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
		.addContainerGap())
		);

        getContentPane().add(originalJPanel, java.awt.BorderLayout.WEST);

        sortingAlgorithmlJLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        sortingAlgorithmlJLabel.setText("Sorting Algorithm:");

        sortingJPanel.setLayout(new java.awt.GridLayout(6, 1, 5, 5));

        sortingButtonGroup.add(bubbleJRadioButton);
        bubbleJRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14));

        bubbleJRadioButton.setText("Heap");
        sortingJPanel.add(bubbleJRadioButton);

        sortingButtonGroup.add(selectionJRadioButton);
        selectionJRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        selectionJRadioButton.setText("Selection");
        sortingJPanel.add(selectionJRadioButton);

        sortingButtonGroup.add(insertionJRadioButton);
        insertionJRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14));

        insertionJRadioButton.setText("Insertion");
        sortingJPanel.add(insertionJRadioButton);

        sortingButtonGroup.add(quickJRadioButton);
        quickJRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14));

        quickJRadioButton.setText("Quick");
        sortingJPanel.add(quickJRadioButton);

        sortingButtonGroup.add(mergeJRadioButton);
        mergeJRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14));

        mergeJRadioButton.setText("Merge");
        sortingJPanel.add(mergeJRadioButton);


		searchingJPanel.setLayout(new java.awt.GridLayout(6, 1));

		searchingButtonGroup.add(linearJRadioButton);
		linearJRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14));

		linearJRadioButton.setText("In Random");
		linearJRadioButton.setEnabled(false);
		searchingJPanel.add(linearJRadioButton);

        sortingButtonGroup.add(heapJRadioButton);
        heapJRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14));

        heapJRadioButton.setText("Radix");
        sortingJPanel.add(heapJRadioButton);


        linearJTextField.setFont(new java.awt.Font("Tahoma", 0, 14));
        linearJTextField.setToolTipText("Press Enter to perform search");
        linearJTextField.setEnabled(false);
        searchingJPanel.add(linearJTextField);

        searchingButtonGroup.add(binaryJRadioButton);
        binaryJRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14));

        binaryJRadioButton.setText("Random");
        binaryJRadioButton.setEnabled(false);
        searchingJPanel.add(binaryJRadioButton);

        timeJLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
		timeJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		timeJLabel.setText("Time: nanoseconds");
		searchingJPanel.add(timeJLabel);


        binaryJTextField.setFont(new java.awt.Font("Tahoma", 0, 14));
        binaryJTextField.setToolTipText("Enter");
        binaryJTextField.setEnabled(false);
        searchingJPanel.add(binaryJTextField);



        timeJTextField.setEditable(false);
        searchingJPanel.add(timeJTextField);

        searchingAlgorithmlJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchingAlgorithmlJLabel.setText("Searching Algorithm:");

		javax.swing.GroupLayout sortingAlgorithmJPanelLayout = new javax.swing.GroupLayout(sortingAlgorithmJPanel);
		sortingAlgorithmJPanel.setLayout(sortingAlgorithmJPanelLayout);
		sortingAlgorithmJPanelLayout.setHorizontalGroup(
		sortingAlgorithmJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(sortingAlgorithmJPanelLayout.createSequentialGroup()
		.addGroup(sortingAlgorithmJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addComponent(sortingJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sortingAlgorithmJPanelLayout.createSequentialGroup()
		.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		.addComponent(sortingAlgorithmlJLabel))
		.addGroup(sortingAlgorithmJPanelLayout.createSequentialGroup()
		.addContainerGap()
		.addComponent(searchingAlgorithmlJLabel))
		.addComponent(searchingJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		.addContainerGap())
		);


		sortingAlgorithmJPanelLayout.setVerticalGroup(
		sortingAlgorithmJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(sortingAlgorithmJPanelLayout.createSequentialGroup()
		.addContainerGap()
		.addComponent(sortingAlgorithmlJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		.addComponent(sortingJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		.addComponent(searchingAlgorithmlJLabel)
		.addGap(1, 1, 1)
		.addComponent(searchingJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
		.addContainerGap())
		);

        getContentPane().add(sortingAlgorithmJPanel, java.awt.BorderLayout.CENTER);

        sortedJScrollPane.setViewportView(sortedJList);

        sortedJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sortedJLabel.setText("Sorted Values:");

		javax.swing.GroupLayout sortedJPanelLayout = new javax.swing.GroupLayout(sortedJPanel);
		sortedJPanel.setLayout(sortedJPanelLayout);
		sortedJPanelLayout.setHorizontalGroup(
		sortedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(sortedJPanelLayout.createSequentialGroup()
		.addGroup(sortedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(sortedJPanelLayout.createSequentialGroup()
		.addContainerGap()
		.addComponent(sortedJLabel))
		.addGroup(sortedJPanelLayout.createSequentialGroup()
		.addGap(19, 19, 19)
		.addComponent(sortedJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
		.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		sortedJPanelLayout.setVerticalGroup(
		sortedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(sortedJPanelLayout.createSequentialGroup()
		.addContainerGap()
		.addComponent(sortedJLabel)
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		.addComponent(sortedJScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
		.addContainerGap())
		);

		getContentPane().add(sortedJPanel, java.awt.BorderLayout.EAST);

		controlJPanel.setMinimumSize(new java.awt.Dimension(325, 40));
		controlJPanel.setPreferredSize(new java.awt.Dimension(325, 40));
		controlJPanel.setLayout(new java.awt.GridLayout(1, 3, 5, 5));

		createJButton.setFont(new java.awt.Font("Tahoma", 0, 14));
		createJButton.setMnemonic('C');
		createJButton.setText("Create Data");
		createJButton.setToolTipText("Generate random integers set");
		createJButton.addActionListener(new java.awt.event.ActionListener() {




		public void actionPerformed(java.awt.event.ActionEvent evt) {
		createJButtonActionPerformed(evt);
            }

        });
        controlJPanel.add(createJButton);

        sortJButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        sortJButton.setMnemonic('S');
        sortJButton.setText("Sort");
        sortJButton.setToolTipText("Sort data with chosen algorithm");
        sortJButton.setEnabled(false);
        sortJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortJButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(sortJButton);

        createJButton1.setFont(new java.awt.Font("Tahoma", 0, 14));
        createJButton1.setMnemonic('x');
        createJButton1.setText("Exit");
        createJButton1.setToolTipText("Generate random integers set");
        createJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButton1ActionPerformed(evt);
            }
        });
        controlJPanel.add(createJButton1);

        getContentPane().add(controlJPanel, java.awt.BorderLayout.SOUTH);

        pack();
    }

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {
        for (int i = 0; i < MAX; i++) {
            integerArray[i] = rand.nextInt(MIN);
        }
        originalJList.setListData(integerArray);
        sortJButton.setEnabled(true);
        linearJRadioButton.setEnabled(true);
        binaryJRadioButton.setEnabled(true);
    }

    private void sortJButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int radButton = whichSortRadioButton();
        int[] dataArray = new int[integerArray.length];

        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = integerArray[i].intValue();
        }


        switch (radButton) {
            case 0:
                startTime = System.nanoTime();
                radix(dataArray);
                stopTime = System.nanoTime();
                totalTime = stopTime - startTime;
                timeJTextField.setText(String.valueOf(totalTime));
                break;
            case 1:

                startTime = System.nanoTime();
                selectionSort(dataArray);
                stopTime = System.nanoTime();
                totalTime = stopTime - startTime;
                timeJTextField.setText(String.valueOf(totalTime));
                break;
            case 2:
                startTime = System.nanoTime();
                insertionSort(dataArray);
                stopTime = System.nanoTime();
                totalTime = stopTime - startTime;
                timeJTextField.setText(String.valueOf(totalTime));
                break;
            case 3:
                startTime  = System.nanoTime();
                quickSort(dataArray);
                stopTime = System.nanoTime();
                totalTime = stopTime - startTime;
                timeJTextField.setText(String.valueOf(totalTime));
                break;
            case 4:
                startTime  = System.nanoTime();
                mergeSort(dataArray);
                stopTime = System.nanoTime();
                totalTime = stopTime - startTime;
                timeJTextField.setText(String.valueOf(totalTime));
                break;
            case 5:
                startTime = System.nanoTime();
                heapSort(dataArray);
                stopTime = System.nanoTime();
                totalTime = stopTime - startTime;
                timeJTextField.setText(String.valueOf(totalTime));
                break;
        }
					display(dataArray);
					linearJTextField.setText("");
					binaryJTextField.setText("");
					linearJRadioButton.setEnabled(true);
					binaryJRadioButton.setEnabled(true);
    }

    private void createJButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private int whichSortRadioButton()
    {
        if (selectionJRadioButton.isSelected())
            return 1;
        else
            if (insertionJRadioButton.isSelected())
                return 2;
            else
                if (quickJRadioButton.isSelected())
                    return 3;
                else
                    if (mergeJRadioButton.isSelected())
                        return 4;
                    else
                        if (heapJRadioButton.isSelected())
                            return 5;
                        else
                        {
                            bubbleJRadioButton.setSelected(true);
                            return 0;
                        }
    }


    private void display (int[] intArray)
    {
        Integer[] integerArray = new Integer[intArray.length];
        for(int i = 0; i < intArray.length; i++)
            integerArray[i] = intArray[i];
        sortedJList.setListData(integerArray);
    }

    private void radix(int []array)
    {
        int n = array.length;
        for (int passedNum = 1; passedNum < n; passedNum++)
        {
        for (int i = 0; i < n - passedNum; i++) {
            if (array[i] > array[i+1]) {
                int temp = array[i];  array[i] = array[i+1];  array[i+1] = temp;
            }
        }
    }
    }

    private void selectionSort(int []array)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            int minPosition = i;
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[minPosition] > array[j])
                minPosition = j;
            }
            if (minPosition != i)
            {

                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }

    public static void insertionSort(int[] array){
    for (int i = 1; i < array.length; i++){
        int j = i;
        int B = array[i];
        while ((j > 0) && (array[j-1] > B)){
            array[j] = array[j-1];
            j--;
        }
        array[j] = B;
    }
}

    private static void mergeSort(int[]array)
    {

        merge(array, 0, array.length);
    }

    private static void quickSort(int[]array)
    {
        if(array== null || array.length<=1)
        {
            return;
        }
        quick(array, 0, array.length-1);
    }

    private static void heapSort(int[] array)
    {
       range = array.length;
       Max_Value(array); //first we build max heap
       for (int i = array.length-1; i>0; i--)
       {

	   int temp = array[0];
	   array[0] = array[i];
	   array[i] = temp;

	   range--;

	   Base(array,0);
       }
    }

    private static void merge(int[] array, int low, int high)
    {
        if (high - low == 1) return; //only one element in the array, return.
		int mid = low + (high - low) / 2; //find middle
		merge(array, low, mid); //sort first part
		merge(array, mid, high); //sort second part
		MergeNumber(array, new int[array.length], low, mid, high); //merge both parts
    }

    private static void MergeNumber(int[] array, int[] temp, int low, int middle, int high)
    {
        int i = low;
	int j = middle;
	for (int k = low; k < high; k++)
    {
        if (i == middle) temp[k] = array[j++]; //if lo-mid array is empty
		else if (j == high) temp[k] = array[i++];
		else if (array[j] > array[i]) temp[k] = array[i++];
		else temp[k] = array[j++];
	}

	for (int k = low; k < high; k++)
		array[k] = temp[k];
    }

    private static void quick(int[] array, int low, int high)
    {

        if (high <= low)
            return;
        int j = array_merge(array, low, high);
                sort(array, low, high);
                assert isSorted(array, low, high);
    }



    private static int array_merge(int[] array, int low, int high) {
        int i = low;
        int j = high + 1;
        Comparable v = array[low];
        while (true) {

            while (less(array[++i], v))
                if (i == high) break;

            while (less(v, array[--j]))
                if (j == low) break;

            if (i >= j) break;

            swap(array, i, j);
        }

        swap(array, low, j);

        return j;
    }

    private static void sort(int[] array, int low, int high)
    {
        if (high <= low) return;
        int j = array_merge(array, low, high);
        sort(array, low, j-1);
        sort(array, j+1, high);
        assert isSorted(array, low, high);
    }

    private static boolean isSorted(int[] array, int low, int high)
    {
        for (int i = low + 1; i <= high; i++)
            if (less(array[i], array[i-1])) return false;
        return true;
    }

    private static boolean less(Comparable v, Comparable w)
    {
        return (v.compareTo(w) < 0);
    }

    private static void swap(int[] array,int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    private static void Max_Value(int[] array)
    {
	for(int i = array.length/2-1;i>=0;i--)
        {
            Base(array, i);
	}
    }

    private static void Base(int[] array, int i)
    {
	int l = Left(i);
	int r = Right(i);
	int max;
	if (l < range)
        {
            if (array[l] > array[i]){
                max = l;
            }
            else
            {
                max = i;
            }
	}
        else
        {
            max = i;
	}
        if (r < range)
        {
            if(array[r] > array[max])
            {
                max = r;
            }
        }
        if (max != i)
        {

            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;


            Base(array, max);
	}
    }


    private static int Left(int i) //left parent
    {
        return 2 * i;
    }
    private static int Right(int i) //right parent
    {
        return (2 * i) + 1;
    }

    public void binarySearch() //completes binary search tree and merges
    {
        if (linearJRadioButton.isSelected())
            linearJTextField.isEnabled();
    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) { //catch exceptions for gui class exception packages
            java.util.logging.Logger.getLogger(SortingAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SortingAlgorithms().setVisible(true);
            }
        });
    }

    private javax.swing.JRadioButton binaryJRadioButton; //j radio buttons for GUI
    private javax.swing.JTextField binaryJTextField;
    private javax.swing.JRadioButton bubbleJRadioButton;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JButton createJButton;
    private javax.swing.JButton createJButton1;
    private javax.swing.JRadioButton heapJRadioButton;
    private javax.swing.JRadioButton insertionJRadioButton;
    private javax.swing.JRadioButton linearJRadioButton;
    private javax.swing.JTextField linearJTextField;
    private javax.swing.JRadioButton mergeJRadioButton;
    private javax.swing.JLabel originalJLabel;
    private javax.swing.JList originalJList;
    private javax.swing.JPanel originalJPanel;
    private javax.swing.JScrollPane originalJScrollPane;
    private javax.swing.JRadioButton quickJRadioButton;
    private javax.swing.JLabel searchingAlgorithmlJLabel;
    private javax.swing.ButtonGroup searchingButtonGroup;
    private javax.swing.JPanel searchingJPanel;
    private javax.swing.JRadioButton selectionJRadioButton;
    private javax.swing.JButton sortJButton;
    private javax.swing.JLabel sortedJLabel;
    private javax.swing.JList sortedJList;
    private javax.swing.JPanel sortedJPanel;
    private javax.swing.JScrollPane sortedJScrollPane;
    private javax.swing.JPanel sortingAlgorithmJPanel;
    private javax.swing.JLabel sortingAlgorithmlJLabel;
    private javax.swing.ButtonGroup sortingButtonGroup;
    private javax.swing.JPanel sortingJPanel;
    private javax.swing.JLabel timeJLabel;
    private javax.swing.JTextField timeJTextField;
}
