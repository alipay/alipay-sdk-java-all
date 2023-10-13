package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗分期分期码码申领
 *
 * @author auto create
 * @since 1.0, 2023-06-28 17:08:15
 */
public class AlipayPcreditHuabeiFqqrcodeHbfqCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1383667169686941215L;

	/**
	 * 用于物流派送的收件详细地址.
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区编码,用于物流派送的收件地址.地址库版本LBS:2020Q1.例如320102表示江苏省南京市玄武区,则本字段传02.
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 市编码,用于物流派送的收件地址.地址库版本LBS:2020Q1.例如320100表示江苏省南京市,则本字段传01
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 商户申请的码类型.码类型分为主扫和被扫.0表示被扫,1表示主扫.如果要申请主扫码,则本字段传1;如果要申请被扫码,本字段传0.
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 扩展字段,用于满足一些定制化的申请码需求.
	 */
	@ApiField("fqqr_code_ext_info")
	private FqQrCodeExtendParams fqqrCodeExtInfo;

	/**
	 * 商户申请的物料样式.例如:0代表立牌,1代表贴纸.如果要申请立牌码的话,本字段传0.
	 */
	@ApiField("materials")
	private String materials;

	/**
	 * 收件人姓名.申请成功后,会给商户邮寄实体码,需要给物流放提供收件信息.
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部请求号,用于唯一标识一次请求.仅可以由英文字母和数字组成.需要保证在服务商端不重复.
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 省份编码,用于物流派送的收件地址.地址库版本:LBS:2020Q1.例如:320000表示江苏省,则本字段传32.
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 商家本次请求希望申请的物料数量.
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 二级商户唯一标识
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 服务商唯一标识
	 */
	@ApiField("source")
	private String source;

	/**
	 * 商店唯一标识,可以为空.
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 街道编码,用于物流派送的收件地址.地址库版本LBS:2020Q1.例如320102003表示江苏省南京市玄武区新街口街道,则本字段传003.
	 */
	@ApiField("street_code")
	private String streetCode;

	/**
	 * 收件人联系方式,手机号.用于物流派送时联系收件人.
	 */
	@ApiField("tel")
	private String tel;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public FqQrCodeExtendParams getFqqrCodeExtInfo() {
		return this.fqqrCodeExtInfo;
	}
	public void setFqqrCodeExtInfo(FqQrCodeExtendParams fqqrCodeExtInfo) {
		this.fqqrCodeExtInfo = fqqrCodeExtInfo;
	}

	public String getMaterials() {
		return this.materials;
	}
	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStreetCode() {
		return this.streetCode;
	}
	public void setStreetCode(String streetCode) {
		this.streetCode = streetCode;
	}

	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

}
