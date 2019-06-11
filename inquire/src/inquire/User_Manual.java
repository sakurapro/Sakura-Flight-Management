package inquire;

public class User_Manual
{
    /*
    本Jframe主要面对两个群体，一是用户，二是管理人员，Login_Interface是主界面
    当你是用户时：
        1.你若已经是会员：
            【1】当你忘记密码时，你可以点击Forgot Password，进入Retrieve_Password界面，通过输入姓名，身份证号与电话号码，找回自己的密码，后可重新进入Login_Interface主界面
            【2】当你正确输入用户名与密码进入Personal_Center界面后，可进行三个操作，
                （1）添加行程，进入Booking界面，选择地点后，进入Result界面，选择好具体航班后，进入Successful_Booking界面，后可继续订票进入Booking界面，或退出本Jframe
                （2）修改信息，进入Modify_Information界面，可修改你的用户名，手机号码与密码，修改成功后，返回Personal_Center界面
                （3）退出登录，进入Login_Interface主界面
        2.你若不是会员：
            （1）你可以先注册会员，进入New_User界面，注册成功后进入Personal_Center界面
            （2）你可以跳过注册，直接进行订票，进入Booking界面
    当你是管理员时：
        你可以进入Flight_Management界面，在此界面可查询所有的航班，并有三个功能:
            (1)增加航班，进入New_Flight界面
            (2)删除航班，进入Delete_Flight界面
            (3)更新航班，进入Update_Flight界面
    */
    
}
