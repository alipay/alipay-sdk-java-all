package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商业关系门店详情信息
 *
 * @author auto create
 * @since 1.0, 2023-11-02 09:58:16
 */
public class BusinessRelationShopDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 3364415592882786187L;

	/**
	 * 经营地址
	 */
	@ApiListField("business_address")
	@ApiField("business_relation_shop_addresss")
	private List<BusinessRelationShopAddresss> businessAddress;

	/**
	 * 经营时间
	 */
	@ApiListField("business_times")
	@ApiField("business_relation_business_time")
	private List<BusinessRelationBusinessTime> businessTimes;

	/**
	 * 营业执照图片地址
	 */
	@ApiField("cert_image")
	private String certImage;

	/**
	 * 营业执照名称，填写值为营业执照或统一社会信用代码证上的名称。
注意：
*若传入 cert_no，则本参数必填。
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 营业执照标号，
注意：
* 如果传了cert_image，则此字段必填
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，取值范围：201：营业执照；2011:多证合一(统一社会信用代码)。
注意：
*若传入 cert_no，则本参数必填。
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 商业关系门店手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 商业关系门店固话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 扩展信息列表
	 */
	@ApiField("ext_infos")
	private BusinessRelationExtInfo extInfos;

	/**
	 * 门头照图片地址
	 */
	@ApiListField("out_door_images")
	@ApiField("string")
	private List<String> outDoorImages;

	/**
	 * 基于商业关系的代运营门店id
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	/**
	 * 代运营商业关系门店logo地址
	 */
	@ApiField("real_shop_logo")
	private String realShopLogo;

	/**
	 * 外部门店编号，用于ISV系统内部门店标识等
	 */
	@ApiField("real_shop_no")
	private String realShopNo;

	/**
	 * 新版门店类目标准二级类目code。类目标准及与原类目映射关系参见 支付宝门店类目-最新 表格。
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 代运营商业关系门店名称，即当前组织下可运营门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public List<BusinessRelationShopAddresss> getBusinessAddress() {
		return this.businessAddress;
	}
	public void setBusinessAddress(List<BusinessRelationShopAddresss> businessAddress) {
		this.businessAddress = businessAddress;
	}

	public List<BusinessRelationBusinessTime> getBusinessTimes() {
		return this.businessTimes;
	}
	public void setBusinessTimes(List<BusinessRelationBusinessTime> businessTimes) {
		this.businessTimes = businessTimes;
	}

	public String getCertImage() {
		return this.certImage;
	}
	public void setCertImage(String certImage) {
		this.certImage = certImage;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

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

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public BusinessRelationExtInfo getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(BusinessRelationExtInfo extInfos) {
		this.extInfos = extInfos;
	}

	public List<String> getOutDoorImages() {
		return this.outDoorImages;
	}
	public void setOutDoorImages(List<String> outDoorImages) {
		this.outDoorImages = outDoorImages;
	}

	public String getRealShopId() {
		return this.realShopId;
	}
	public void setRealShopId(String realShopId) {
		this.realShopId = realShopId;
	}

	public String getRealShopLogo() {
		return this.realShopLogo;
	}
	public void setRealShopLogo(String realShopLogo) {
		this.realShopLogo = realShopLogo;
	}

	public String getRealShopNo() {
		return this.realShopNo;
	}
	public void setRealShopNo(String realShopNo) {
		this.realShopNo = realShopNo;
	}

	public String getShopCategory() {
		return this.shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
