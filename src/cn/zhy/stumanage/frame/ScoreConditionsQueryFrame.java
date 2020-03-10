package cn.zhy.stumanage.frame;

import cn.zhy.stumanage.dao.ManageHelper;
import cn.zhy.stumanage.model.ScoreModel;
import cn.zhy.stumanage.util.CreateSql;
import cn.zhy.stumanage.util.WindowUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

///成绩多条件查询界面
public class ScoreConditionsQueryFrame extends JDialog{
	private JLabel student_ID;    //"学号"标签。
	private JLabel student_Name;	//"姓名"标签。
	private JLabel sex_Label;	//"性别"标签。l
	private JLabel classe_Label;	//"班级"标签。
	private JLabel grade_Label;	//"年级标签"。
	private JLabel major_Label;	//"专业"标签。
	private JLabel department_Label;	//"所属院系"标签。
	private JTextField student_IDText;	//"学号"文本域。
	private JTextField student_NameText;	//"姓名"文本域。
	private JTextField sex_Text;	//性别选项
	private JTextField grade_Text;	//年级选项
	private JTextField department_Text;	//系别
	private JTextField major_Text;	//专业
	private JTextField classe_Text;	//班级
	private JButton conditions_button;	//多条件查询按钮
	private ManageHelper helper;
	private JDialog jd;	//当前窗口
	/**
	 *
	 * @param owner 它的父窗口
	 * @param title 窗口名
	 * @param modal 指定的模式窗口，还有非模式窗口
	 */
	public ScoreConditionsQueryFrame(JDialog owner, String title, boolean modal,JTable jt,String department,String major,String grade){
		super(owner, title, modal);
		this.jd = this;
		this.setLayout(null);
		student_ID = new JLabel("学号:");
		student_ID.setBounds(29, 19, 30, 20);
		this.add(student_ID);

		student_IDText = new JTextField();
		student_IDText.setBounds(65, 19, 100, 20);
		this.add(student_IDText);

		student_Name = new JLabel("姓名:");
		student_Name.setBounds(200, 19, 30, 20);
		this.add(student_Name);

		student_NameText = new JTextField();
		student_NameText.setBounds(240, 19, 100, 20);
		this.add(student_NameText);

		sex_Label = new JLabel("性别:");
		sex_Label.setBounds(29, 50, 30, 20);
		this.add(sex_Label);

		sex_Text = new JTextField();
		sex_Text.setBounds(65, 50, 100, 20);
		this.add(sex_Text);

		grade_Label = new JLabel("年级:");
		grade_Label.setBounds(200, 50, 30, 20);
		this.add(grade_Label);

		grade_Text = new JTextField();
		grade_Text.setBounds(240, 50, 100, 20);
		grade_Text.setText(grade);
		grade_Text.setEditable(false);
		this.add(grade_Text);

		department_Label = new JLabel("院系:");
		department_Label.setBounds(29, 83, 30, 20);
		this.add(department_Label);

		department_Text = new JTextField();
		department_Text.setBounds(65, 83, 100, 20);
		department_Text.setText(department);
		department_Text.setEditable(false);
		this.add(department_Text);

		major_Label = new JLabel("专业:");
		major_Label.setBounds(200, 83, 30, 20);
		this.add(major_Label);

		major_Text = new JTextField();
		major_Text.setBounds(240, 83, 150, 20);
		major_Text.setText(major);
		major_Text.setEditable(false);
		this.add(major_Text);

		classe_Label = new JLabel("班级:");
		classe_Label.setBounds(29,116, 30, 20);
		this.add(classe_Label);

		classe_Text = new JTextField();
		classe_Text.setBounds(65, 116, 100, 20);
		this.add(classe_Text);

		conditions_button = new JButton("多条件查询");
		conditions_button.setBounds(230, 130, 100, 30);
		//注册"多条件查询"按钮事件监听
		conditions_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String id = student_IDText.getText().trim();
				String name = student_NameText.getText().trim();
				String sex = sex_Text.getText().trim();
				String grade = grade_Text.getText().trim();
				String department = department_Text.getText().trim();
				String major = major_Text.getText().trim();
				String classe = classe_Text.getText().trim();
				if(id.equals("")&&name.equals("")&&sex.equals("")&&grade.equals("")&&department.equals("")&&major.equals("")&&classe.equals("")){
					JOptionPane.showMessageDialog(jd, "条件不能为空！", "", JOptionPane.WARNING_MESSAGE);
					return ;
				}else{
					String sql = CreateSql.getConditions_Sql(id, name, sex, grade, department, major, classe);
					ScoreModel sm = new ScoreModel(sql, major, grade, jd);
					jt.setModel(sm);
					jd.dispose();
				}

			}
		});
		this.add(conditions_button);


		this.setSize(411, 222);
		this.setResizable(false);
		WindowUtil.setFrameCenter(this);
		this.setVisible(true);
	}
}