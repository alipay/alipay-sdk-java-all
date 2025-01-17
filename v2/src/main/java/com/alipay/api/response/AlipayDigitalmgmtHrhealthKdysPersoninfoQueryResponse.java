package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.hrhealth.kdys.personinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:28
 */
public class AlipayDigitalmgmtHrhealthKdysPersoninfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7282698346224695674L;

	/** 
	 * 出生日期，yyyy-MM-dd格式
	 */
	@ApiField("birthday")
	private Date birthday;

	/** 
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型对应的枚举值，对应关系见枚举值描述
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 人员姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 人员类型，对应关系见枚举值，若枚举值不匹配则为不享有服务
	 */
	@ApiField("person_type")
	private String personType;

	/** 
	 * 性别，对应关系见枚举值
	 */
	@ApiField("sex")
	private String sex;

	/** 
	 * 钉钉unionId，唯一用户标识
	 */
	@ApiField("union_id")
	private String unionId;

	/** 
	 * 钉钉userId
	 */
	@ApiField("user_id")
	private String userId;

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getBirthday( ) {
		return this.birthday;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}
	public String getPersonType( ) {
		return this.personType;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex( ) {
		return this.sex;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}
	public String getUnionId( ) {
		return this.unionId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
