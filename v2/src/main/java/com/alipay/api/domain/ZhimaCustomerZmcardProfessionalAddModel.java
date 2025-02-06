package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻证经营版商户上传职业人员信息
 *
 * @author auto create
 * @since 1.0, 2024-07-10 17:01:16
 */
public class ZhimaCustomerZmcardProfessionalAddModel extends AlipayObject {

	private static final long serialVersionUID = 5131223484989628596L;

	/**
	 * 证书列表，相同证书每次传入是更新
	 */
	@ApiListField("certification_list")
	@ApiField("zm_card_picture_info")
	private List<ZmCardPictureInfo> certificationList;

	/**
	 * 商户请求受理台时传入的外部授权单号，用于验证用户是否授权
	 */
	@ApiField("conn_key")
	private String connKey;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 照片列表
	 */
	@ApiListField("picture_list")
	@ApiField("zm_card_picture_info")
	private List<ZmCardPictureInfo> pictureList;

	/**
	 * 职业人员擅长的领域，如减脂塑形、饮食管理、体能训练、增肌、瑜伽、普拉提、功能性训练、康复训练、体能抗阻、体态调整、理疗、格斗拳击、青少年体适能、其他。
	 */
	@ApiListField("specialties")
	@ApiField("string")
	private List<String> specialties;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 大概的从业年限，如1~3年、4~6年、7~10年、10年以上。
不在上述文本中的会被丢弃
	 */
	@ApiField("working_years_in_field")
	private String workingYearsInField;

	public List<ZmCardPictureInfo> getCertificationList() {
		return this.certificationList;
	}
	public void setCertificationList(List<ZmCardPictureInfo> certificationList) {
		this.certificationList = certificationList;
	}

	public String getConnKey() {
		return this.connKey;
	}
	public void setConnKey(String connKey) {
		this.connKey = connKey;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<ZmCardPictureInfo> getPictureList() {
		return this.pictureList;
	}
	public void setPictureList(List<ZmCardPictureInfo> pictureList) {
		this.pictureList = pictureList;
	}

	public List<String> getSpecialties() {
		return this.specialties;
	}
	public void setSpecialties(List<String> specialties) {
		this.specialties = specialties;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getWorkingYearsInField() {
		return this.workingYearsInField;
	}
	public void setWorkingYearsInField(String workingYearsInField) {
		this.workingYearsInField = workingYearsInField;
	}

}
