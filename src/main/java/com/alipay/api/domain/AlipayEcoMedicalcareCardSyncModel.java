package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子社保卡绑卡信息回流
 *
 * @author auto create
 * @since 1.0, 2019-09-17 22:54:04
 */
public class AlipayEcoMedicalcareCardSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2622116426291786968L;

	/**
	 * 银行卡卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 社保卡版本,默认值为2.0,可选参数如下:
1代卡:1.0
2代卡:2.0
3代卡:3.0
	 */
	@ApiField("card_version")
	private String cardVersion;

	/**
	 * 扩展参数,json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 请求发生时间
	 */
	@ApiField("gmt_time")
	private Date gmtTime;

	/**
	 * 社保卡内部卡号
	 */
	@ApiField("medical_card_id")
	private String medicalCardId;

	/**
	 * 医保机构代码:
CDHRSS  成都市人力资源和社会保障局
DYINGHRSS  东营市人力资源和社会保障局
JXHRSS  嘉兴市社会保障事务局
SZHRSS  深圳市人力资源和社会保障局
TCHRSS  铜川市人力资源和社会保障局
WHHRSS  武汉市人力资源和社会保障局
XMHRSS  厦门市人力资源和社会保障局
XTHRSS  湘潭市人力资源和社会保障局
ZHZHHRSS  郑州市人力资源和社会保障局
ZJHRSS  镇江市人力资源和社会保障局
	 */
	@ApiField("medical_card_inst_id")
	private String medicalCardInstId;

	/**
	 * 外部社保卡号
	 */
	@ApiField("medical_card_no")
	private String medicalCardNo;

	/**
	 * 社保卡状态:
有效：active
办理中：process
有效：active
办理中：process
注销：cancel
挂失：loss
	 */
	@ApiField("medical_card_status")
	private String medicalCardStatus;

	/**
	 * 卡类型:
金融卡：finance
非金融卡: unfinance
	 */
	@ApiField("medical_card_type")
	private String medicalCardType;

	/**
	 * 外部社保卡有效期,默认是10年,无有效期则不需要上传
	 */
	@ApiField("medical_card_validate_date")
	private Date medicalCardValidateDate;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 外部医保实名姓名
	 */
	@ApiField("out_real_name")
	private String outRealName;

	/**
	 * 外部登陆账户
	 */
	@ApiField("out_user_account")
	private String outUserAccount;

	/**
	 * 外部返回证件号码,依赖于证件类型（user_card_type）
	 */
	@ApiField("out_user_card_no")
	private String outUserCardNo;

	/**
	 * 外部返回证件类型:
01	身份证
02	护照
03	军官证
04	士兵证
05	户口本
06	警官证
07	台湾居民来往大陆通行证（简称“台胞证”）
08	港澳居民来往内地通行证（简称“回乡证”）
09	临时身份证
10	港澳通行证
11	营业执照
12	外国人居留证
13	香港身份证
14	武警证
15	组织机构代码证
16	行政机关
17	社会团体
18	军队
19	武警
20	下属机构(具有主管单位批文号)
21	基金会
99	其它
	 */
	@ApiField("out_user_card_type")
	private String outUserCardType;

	/**
	 * 图片流Base64信息,图片大小10k以内,png格式
	 */
	@ApiField("out_user_certify_pic")
	private String outUserCertifyPic;

	/**
	 * 外部登陆账户ID
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 监护关系
默认为空，表示是user_id对应的本人;
如有值表示user_id对应为监护人;
01	父子
02	母子
03	其他
	 */
	@ApiField("relation_type")
	private String relationType;

	/**
	 * 社会保障号
	 */
	@ApiField("social_card_no")
	private String socialCardNo;

	/**
	 * 支付宝账户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getCardVersion() {
		return this.cardVersion;
	}
	public void setCardVersion(String cardVersion) {
		this.cardVersion = cardVersion;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public Date getGmtTime() {
		return this.gmtTime;
	}
	public void setGmtTime(Date gmtTime) {
		this.gmtTime = gmtTime;
	}

	public String getMedicalCardId() {
		return this.medicalCardId;
	}
	public void setMedicalCardId(String medicalCardId) {
		this.medicalCardId = medicalCardId;
	}

	public String getMedicalCardInstId() {
		return this.medicalCardInstId;
	}
	public void setMedicalCardInstId(String medicalCardInstId) {
		this.medicalCardInstId = medicalCardInstId;
	}

	public String getMedicalCardNo() {
		return this.medicalCardNo;
	}
	public void setMedicalCardNo(String medicalCardNo) {
		this.medicalCardNo = medicalCardNo;
	}

	public String getMedicalCardStatus() {
		return this.medicalCardStatus;
	}
	public void setMedicalCardStatus(String medicalCardStatus) {
		this.medicalCardStatus = medicalCardStatus;
	}

	public String getMedicalCardType() {
		return this.medicalCardType;
	}
	public void setMedicalCardType(String medicalCardType) {
		this.medicalCardType = medicalCardType;
	}

	public Date getMedicalCardValidateDate() {
		return this.medicalCardValidateDate;
	}
	public void setMedicalCardValidateDate(Date medicalCardValidateDate) {
		this.medicalCardValidateDate = medicalCardValidateDate;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOutRealName() {
		return this.outRealName;
	}
	public void setOutRealName(String outRealName) {
		this.outRealName = outRealName;
	}

	public String getOutUserAccount() {
		return this.outUserAccount;
	}
	public void setOutUserAccount(String outUserAccount) {
		this.outUserAccount = outUserAccount;
	}

	public String getOutUserCardNo() {
		return this.outUserCardNo;
	}
	public void setOutUserCardNo(String outUserCardNo) {
		this.outUserCardNo = outUserCardNo;
	}

	public String getOutUserCardType() {
		return this.outUserCardType;
	}
	public void setOutUserCardType(String outUserCardType) {
		this.outUserCardType = outUserCardType;
	}

	public String getOutUserCertifyPic() {
		return this.outUserCertifyPic;
	}
	public void setOutUserCertifyPic(String outUserCertifyPic) {
		this.outUserCertifyPic = outUserCertifyPic;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getSocialCardNo() {
		return this.socialCardNo;
	}
	public void setSocialCardNo(String socialCardNo) {
		this.socialCardNo = socialCardNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
