package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户卡信息
 *
 * @author auto create
 * @since 1.0, 2023-07-03 13:55:45
 */
public class MerchantCard extends AlipayObject {

	private static final long serialVersionUID = 5198268621734672661L;

	/**
	 * 资金卡余额，单位：元，精确到小数点后两位。
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 支付宝业务卡号

说明：

1、开卡成功后返回该参数，需要保存留用；

2、开卡/更新/删卡/查询卡接口请求中不需要传该参数；
	 */
	@ApiField("biz_card_no")
	private String bizCardNo;

	/**
	 * 会员卡自定义资产值，只供特定业务使用，通常接入无需关注
	 */
	@ApiField("custom_assets")
	private String customAssets;

	/**
	 * 用户在商户crm系统中的会员卡卡号，该参数必填。
	 */
	@ApiField("external_card_no")
	private String externalCardNo;

	/**
	 * 卡面展示图片的图片ID，通过接口（alipay.offline.material.image.upload）上传图片



这里预期展示的是个人照片；

图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；

图片尺寸为230*295px，可等比放大；
	 */
	@ApiField("front_image_id")
	private String frontImageId;

	/**
	 * 卡面文案列表，1项对应1行文案，最多只能传入4行文案；
单行文案展现分为左右两部分，左边对应label字段，右边对应value；
形如： 学院    新闻学院
	 */
	@ApiListField("front_text_list")
	@ApiField("card_front_text_d_t_o")
	private List<CardFrontTextDTO> frontTextList;

	/**
	 * 会员卡等级（由商户自定义，并可以在卡模板创建时，定义等级信息）
	 */
	@ApiField("level")
	private String level;

	/**
	 * 商户动态码回传信息：
只用于当write_off_type核销类型为mdbarcode或mdqrcode时，商户调用卡更新接口回传动态码。如需使用商户动态码，请联系支付宝技术支持获取相关文档。
	 */
	@ApiField("mdcode_info")
	private MdCodeInfoDTO mdcodeInfo;

	/**
	 * 会员卡开卡时间，格式为yyyy-MM-dd HH:mm:ss。会员卡更新时，该时间不支持修改。
	 */
	@ApiField("open_date")
	private Date openDate;

	/**
	 * 会员卡积分，积分必须为数字型（可为浮点型，带2位小数点）
	 */
	@ApiField("point")
	private String point;

	/**
	 * 会员卡更换不同的卡模板（该参数仅用在会员卡更新接口中）
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 会员卡有效期结束时间，格式为yyyy-MM-dd HH:mm:ss。会员卡更新时，该时间不支持修改。
	 */
	@ApiField("valid_date")
	private String validDate;

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBizCardNo() {
		return this.bizCardNo;
	}
	public void setBizCardNo(String bizCardNo) {
		this.bizCardNo = bizCardNo;
	}

	public String getCustomAssets() {
		return this.customAssets;
	}
	public void setCustomAssets(String customAssets) {
		this.customAssets = customAssets;
	}

	public String getExternalCardNo() {
		return this.externalCardNo;
	}
	public void setExternalCardNo(String externalCardNo) {
		this.externalCardNo = externalCardNo;
	}

	public String getFrontImageId() {
		return this.frontImageId;
	}
	public void setFrontImageId(String frontImageId) {
		this.frontImageId = frontImageId;
	}

	public List<CardFrontTextDTO> getFrontTextList() {
		return this.frontTextList;
	}
	public void setFrontTextList(List<CardFrontTextDTO> frontTextList) {
		this.frontTextList = frontTextList;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public MdCodeInfoDTO getMdcodeInfo() {
		return this.mdcodeInfo;
	}
	public void setMdcodeInfo(MdCodeInfoDTO mdcodeInfo) {
		this.mdcodeInfo = mdcodeInfo;
	}

	public Date getOpenDate() {
		return this.openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public String getPoint() {
		return this.point;
	}
	public void setPoint(String point) {
		this.point = point;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getValidDate() {
		return this.validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

}
