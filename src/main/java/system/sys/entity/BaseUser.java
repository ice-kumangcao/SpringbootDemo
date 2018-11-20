package system.sys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="t_s_base_user",schema="")
public class BaseUser implements Serializable {
	private String ID;
    private String activitiSync;
    private String browser;
    private String password;
    private String realname;
    private String signature;
    private String status;
    private String userkey;
    private String username;
    private String departid;
    private String userNameEn;
    private String deleteFlag;
    private String userid;
    @Id
    @Column(name="ID")
    public String getId(){
		return ID;
	}
	public void setId(String ID){
		this.ID=ID;
	}
    @Column(name="activitiSync")
    public String getActivitisync(){
		return activitiSync;
	}
	public void setActivitisync(String activitiSync){
		this.activitiSync=activitiSync;
	}
    @Column(name="browser")
    public String getBrowser(){
		return browser;
	}
	public void setBrowser(String browser){
		this.browser=browser;
	}
    @Column(name="password")
    public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
    @Column(name="realname")
    public String getRealname(){
		return realname;
	}
	public void setRealname(String realname){
		this.realname=realname;
	}
    @Column(name="signature")
    public String getSignature(){
		return signature;
	}
	public void setSignature(String signature){
		this.signature=signature;
	}
    @Column(name="status")
    public String getStatus(){
		return status;
	}
	public void setStatus(String status){
		this.status=status;
	}
    @Column(name="userkey")
    public String getUserkey(){
		return userkey;
	}
	public void setUserkey(String userkey){
		this.userkey=userkey;
	}
    @Column(name="username")
    public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username=username;
	}
    @Column(name="departid")
    public String getDepartid(){
		return departid;
	}
	public void setDepartid(String departid){
		this.departid=departid;
	}
    @Column(name="user_name_en")
    public String getUserNameEn(){
		return userNameEn;
	}
	public void setUserNameEn(String userNameEn){
		this.userNameEn=userNameEn;
	}
    @Column(name="delete_flag")
    public String getDeleteFlag(){
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag){
		this.deleteFlag=deleteFlag;
	}
    @Column(name="userid")
    public String getUserid(){
		return userid;
	}
	public void setUserid(String userid){
		this.userid=userid;
	}
}