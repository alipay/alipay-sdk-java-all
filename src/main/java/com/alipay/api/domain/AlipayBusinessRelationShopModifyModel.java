package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝代运营商业关系门店修改
 *
 * @author auto create
 * @since 1.0, 2021-07-12 11:42:12
 */
public class AlipayBusinessRelationShopModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8724457869273112254L;

	/**
	 * 经营地址
	 */
	@ApiListField("business_address")
	@ApiField("business_relation_shop_addresss")
	private List<BusinessRelationShopAddresss> businessAddress;

	/**
	 * 营业执照图片，需传入<a href="https://opendocs.alipay.com/apis/api_1/ant.merchant.expand.indirect.image.upload">ant.merchant.expand.indirect.image.upload</a> 接口上传图片后得到的 image_id
	 */
	@ApiField("cert_image")
	private String certImage;

	/**
	 * 营业执照名称，填写值为营业执照或统一社会信用代码证上的名称。<br>注意：<br>*若传入 cert_no，则本参数必填。
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 营业执照标号，<br>注意：<br>* 如果传了cert_image，则此字段必填
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，取值范围：201：营业执照；2011:多证合一(统一社会信用代码)。
<br>注意：<br>*若传入 cert_no，则本参数必填。
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 商业关系门店手机号，与商业关系门店固话二选一必填
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 商业关系门店固话，和商业关系门店手机号二选一必填
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 扩展信息列表
	 */
	@ApiListField("ext_infos")
	@ApiField("business_relation_ext_info")
	private List<BusinessRelationExtInfo> extInfos;

	/**
	 * 商业关系组织id 由组织信息创建接口返回或bd分配
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 商业关系组织子类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_sub_type")
	private String groupSubType;

	/**
	 * 商业关系组织类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_type")
	private String groupType;

	/**
	 * 门头照 id，需传入<a href="https://opendocs.alipay.com/apis/api_1/ant.merchant.expand.indirect.image.upload">ant.merchant.expand.indirect.image.upload</a> 接口上传图片后得到的 image_id。<br>蚂蚁门店管理场景可选。
	 */
	@ApiListField("out_door_images")
	@ApiField("string")
	private List<String> outDoorImages;

	/**
	 * 商业关系门店门店id alipay.agent.marketing.business.relation.shop.create接口返回
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	/**
	 * 商业关系门店logo ，和门头照二选一。  需传入<a href="https://opendocs.alipay.com/apis/api_1/ant.merchant.expand.indirect.image.upload">ant.merchant.expand.indirect.image.upload</a> 接口上传图片后得到的 image_id。<br>蚂蚁门店管理场景可选。
	 */
	@ApiField("real_shop_logo")
	private String realShopLogo;

	/**
	 * 外部门店编号，用于ISV系统内部门店标识等
	 */
	@ApiField("real_shop_no")
	private String realShopNo;

	/**
	 * 新版门店类目标准二级类目code。类目标准及与原类目映射关系参见 <a href="https://ur.alipay.com/4cmn0n">支付宝门店类目-最新</a> 表格。
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 代运营商业关系门店名称，即当前组织下可运营商业关系门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public List<BusinessRelationShopAddresss> getBusinessAddress() {
		return this.businessAddress;
	}
	public void setBusinessAddress(List<BusinessRelationShopAddresss> businessAddress) {
		this.businessAddress = businessAddress;
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

	public List<BusinessRelationExtInfo> getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(List<BusinessRelationExtInfo> extInfos) {
		this.extInfos = extInfos;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupSubType() {
		return this.groupSubType;
	}
	public void setGroupSubType(String groupSubType) {
		this.groupSubType = groupSubType;
	}

	public String getGroupType() {
		return this.groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
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
