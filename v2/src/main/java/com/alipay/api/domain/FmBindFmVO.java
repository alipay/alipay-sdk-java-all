package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 亲情账户业务中，主账户绑定的亲情账户列表
 *
 * @author auto create
 * @since 1.0, 2024-07-09 09:52:12
 */
public class FmBindFmVO extends AlipayObject {

	private static final long serialVersionUID = 6479918294894552417L;

	/**
	 * 用户证件号，不脱敏
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * ● 01-居民身份证
● 02-护照
● 03-军官证
● 04-士兵证
● 05-户口本
● 06-警官证
● 07-台湾居民来往大陆通行证（简称“回乡证”）
● 08-港澳居民来往内地通行证（简称“回乡证”）
● 09-临时身份证
● 10-港澳通行证
● 11-营业执照
● 13-香港身份证
● 15-组织机构代码证
● 16-行政机关
● 17-社会团体
● 19-台湾居民来往大陆通行证
● 20-港澳居民居住证
● 21-台湾居民居住证
● 22-外国人永久居留证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * ● FEMALE-女性
● MALE-男性
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 用户昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * ● 03-其他
● 06-父母
● 07-子女
● 08-配偶
	 */
	@ApiField("relation_type")
	private String relationType;

	/**
	 * 用户真实姓名，不脱敏
	 */
	@ApiField("user_real_name")
	private String userRealName;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getUserRealName() {
		return this.userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}

}
