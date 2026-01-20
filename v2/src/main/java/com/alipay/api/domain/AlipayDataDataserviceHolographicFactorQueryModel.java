package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 全息信用2.0中提供给上数业务用于查询支付宝用户的人脉因子和多头因子接口
 *
 * @author auto create
 * @since 1.0, 2017-08-02 17:40:48
 */
public class AlipayDataDataserviceHolographicFactorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4141247113867466845L;

	/**
	 * 参数中文名称:业务id
是否唯一：唯一
参数作用/应用场景：做幂等性控制
枚举值：无
如何获取：调用方生成传递过来
特殊说明：无
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 参数中文名称:身份证号
是否唯一：否
参数作用/应用场景：查询人脉因子和多头因子必备的用户三要素之一
枚举值：无
如何获取：商户传递给上数，上数传递到openapi
特殊说明：无
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 参数中文名称:联系人列表
是否唯一：否
参数作用/应用场景：运行模型生成人脉因子必备的联系人列表参数
枚举值：无
如何获取：上数通过用户授权进行采集通讯录以及运营商报告，上数传递到openapi
特殊说明：无
	 */
	@ApiListField("contact_info_list")
	@ApiField("holo_graphic_contact_info")
	private List<HoloGraphicContactInfo> contactInfoList;

	/**
	 * 参数中文名称:运营商特征
是否唯一：否
参数作用/应用场景：运行模型生成人脉因子必备的运营商特征参数
枚举值：无
如何获取：上数通过用户授权采集运营商报告之后实时加工生成的运营商特征，上数传递到openapi
特殊说明：无
	 */
	@ApiField("isv_feature")
	private String isvFeature;

	/**
	 * 参数中文名称:用户手机号
是否唯一：否
参数作用/应用场景：查询人脉因子和多头因子必备的用户三要素之一
枚举值：无
如何获取：商户传递给上数，上数传递到openapi
特殊说明：无
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 参数中文名称:用户姓名
是否唯一：否
参数作用/应用场景：查询人脉因子和多头因子必备的用户三要素之一
枚举值：无
如何获取：商户传递给上数，上数传递到openapi
特殊说明：无
	 */
	@ApiField("user_name")
	private String userName;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public List<HoloGraphicContactInfo> getContactInfoList() {
		return this.contactInfoList;
	}
	public void setContactInfoList(List<HoloGraphicContactInfo> contactInfoList) {
		this.contactInfoList = contactInfoList;
	}

	public String getIsvFeature() {
		return this.isvFeature;
	}
	public void setIsvFeature(String isvFeature) {
		this.isvFeature = isvFeature;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
