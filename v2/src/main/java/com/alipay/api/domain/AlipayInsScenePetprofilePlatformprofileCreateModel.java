package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 平台宠物档案创建
 *
 * @author auto create
 * @since 1.0, 2022-03-28 16:51:03
 */
public class AlipayInsScenePetprofilePlatformprofileCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7241533475951634451L;

	/**
	 * 生日 档案生日不能早于2000年，且不能晚于当天
	 */
	@ApiField("birthday")
	private Date birthday;

	/**
	 * 宠物性别 1 公; 2 母
	 */
	@ApiField("gender")
	private Long gender;

	/**
	 * 宠物昵称 不能包含字母、数字和中文以外的字符
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 外部业务单号，用于幂等处理，避免多次建档
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 宠物照片列表
	 */
	@ApiListField("photos")
	@ApiField("pet_photo")
	private List<PetPhoto> photos;

	/**
	 * 是否绝育，0 否；1 是；2 未知
	 */
	@ApiField("sterilization")
	private Long sterilization;

	/**
	 * 宠物类型：狗(2000)/猫(1000)
	 */
	@ApiField("type")
	private String type;

	public Date getBirthday() {
		return this.birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Long getGender() {
		return this.gender;
	}
	public void setGender(Long gender) {
		this.gender = gender;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<PetPhoto> getPhotos() {
		return this.photos;
	}
	public void setPhotos(List<PetPhoto> photos) {
		this.photos = photos;
	}

	public Long getSterilization() {
		return this.sterilization;
	}
	public void setSterilization(Long sterilization) {
		this.sterilization = sterilization;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
