package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ISV代创建蚂蚁商户店铺
 *
 * @author auto create
 * @since 1.0, 2019-04-25 13:58:18
 */
public class AntMerchantExpandIsvShopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6737456334713722946L;

	/**
	 * 地址。商户详细经营地址或人员所在地点
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店地址备注，如：地铁口左边
	 */
	@ApiField("address_memo")
	private String addressMemo;

	/**
	 * 门店实景图列表。最多3张，必须是实景图，不可有水印（如果上传装修效果图将驳回）。json格式字符串
支持格式：jpg/png/jpeg/bmp，单张图片不超过5MB，建议尺寸在2000*1500以上。
	 */
	@ApiField("attachment_list")
	private String attachmentList;

	/**
	 * 门店对应的业务类型，可以对应团餐业务：CATERING_DEVICE；
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 店铺经营时间。
	 */
	@ApiListField("business_time")
	@ApiField("shop_business_time")
	private List<ShopBusinessTime> businessTime;

	/**
	 * 学校对应的商户PID
	 */
	@ApiField("campus_id")
	private String campusId;

	/**
	 * 所选学校。指定门店类目下需要上传大学名称信息。
	 */
	@ApiField("campus_name")
	private String campusName;

	/**
	 * 类目标签。选择部分门店类目时，必须要传此值。
比如：校园团餐类目
与类目的映射关系，请参考
	 */
	@ApiField("category_label")
	private String categoryLabel;

	/**
	 * 城市编码，国标码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 店铺联系手机，与店铺联系固话二选一必填
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 店铺的联系固话，和店铺联系手机二选一必填
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 区县编码，区县编码是与国家统计局一致，请查询: http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/ 国标省市区号下载：https://gw.alipayobjects.com/os/bmw-prod/ecac67e2-ff88-4b74-8dbe-33a6cbecfee0.xls
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * ISV联系人手机号码
	 */
	@ApiField("isv_contact_mobile")
	private String isvContactMobile;

	/**
	 * 联系人名字
	 */
	@ApiField("isv_contact_name")
	private String isvContactName;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户id，表示将要开的店属于哪个商户。
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 省份编码，国标码。请查询:
http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/
国标省市区号下载：https://gw.alipayobjects.com/os/bmw-prod/ecac67e2-ff88-4b74-8dbe-33a6cbecfee0.xls
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 资质证明图片。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key列表，json格式字符串，最多可以上传10张
	 */
	@ApiField("qualification_proof_list")
	private String qualificationProofList;

	/**
	 * 资质证明类型。具体选值参见https://mif-pub.alipayobjects.com/QualificationType.xlsx
	 */
	@ApiField("qualification_proof_type")
	private String qualificationProofType;

	/**
	 * 店铺类目，取值参见文件 <a href="https://ur.alipay.com/4cmn0n">蚂蚁门店类目</a>。
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 店铺名称。直连开店要保证全局店铺名称+地址唯一
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺经营类型，01表示直营，02表示加盟
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 外部门店编号，由商户用户自己定义的外部门店编号，同一个商户下门店编号不能重复，否则会创建失败
	 */
	@ApiField("store_id")
	private String storeId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressMemo() {
		return this.addressMemo;
	}
	public void setAddressMemo(String addressMemo) {
		this.addressMemo = addressMemo;
	}

	public String getAttachmentList() {
		return this.attachmentList;
	}
	public void setAttachmentList(String attachmentList) {
		this.attachmentList = attachmentList;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public List<ShopBusinessTime> getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(List<ShopBusinessTime> businessTime) {
		this.businessTime = businessTime;
	}

	public String getCampusId() {
		return this.campusId;
	}
	public void setCampusId(String campusId) {
		this.campusId = campusId;
	}

	public String getCampusName() {
		return this.campusName;
	}
	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

	public String getCategoryLabel() {
		return this.categoryLabel;
	}
	public void setCategoryLabel(String categoryLabel) {
		this.categoryLabel = categoryLabel;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getIsvContactMobile() {
		return this.isvContactMobile;
	}
	public void setIsvContactMobile(String isvContactMobile) {
		this.isvContactMobile = isvContactMobile;
	}

	public String getIsvContactName() {
		return this.isvContactName;
	}
	public void setIsvContactName(String isvContactName) {
		this.isvContactName = isvContactName;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getQualificationProofList() {
		return this.qualificationProofList;
	}
	public void setQualificationProofList(String qualificationProofList) {
		this.qualificationProofList = qualificationProofList;
	}

	public String getQualificationProofType() {
		return this.qualificationProofType;
	}
	public void setQualificationProofType(String qualificationProofType) {
		this.qualificationProofType = qualificationProofType;
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

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
