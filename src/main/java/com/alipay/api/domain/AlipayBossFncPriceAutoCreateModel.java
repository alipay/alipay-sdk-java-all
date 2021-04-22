package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融科技业务价格自动创建接口
 *
 * @author auto create
 * @since 1.0, 2020-01-08 20:10:33
 */
public class AlipayBossFncPriceAutoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8352112826865761574L;

	/**
	 * 系统名称/开放平台appId
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 业务单元编码，内部使用
	 */
	@ApiField("biz_unit_code")
	private String bizUnitCode;

	/**
	 * 商品编码
	 */
	@ApiField("commodity_code")
	private String commodityCode;

	/**
	 * 商品名称
	 */
	@ApiField("commodity_name")
	private String commodityName;

	/**
	 * 商品版本
	 */
	@ApiField("commodity_version")
	private String commodityVersion;

	/**
	 * 创建人工号
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 创建人域账号
	 */
	@ApiField("creator_nm")
	private String creatorNm;

	/**
	 * 价格价格失效时间(格式：yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("gmt_invalid")
	private String gmtInvalid;

	/**
	 * 价格生效时间(格式：yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("gmt_valid")
	private String gmtValid;

	/**
	 * 所属机构，目前未ZL6或者ZL7
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 价格申请说明，解释申请原因备注等信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部业务号，系统根据该字段进行接口幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 价格名称
	 */
	@ApiField("price_name")
	private String priceName;

	/**
	 * 价格来源
	 */
	@ApiField("price_origin")
	private String priceOrigin;

	/**
	 * 价格模板ID
	 */
	@ApiField("price_tpl_id")
	private String priceTplId;

	/**
	 * 价格模板版本，不传默认取最新版本
	 */
	@ApiField("price_tpl_version")
	private String priceTplVersion;

	/**
	 * 租户ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBizUnitCode() {
		return this.bizUnitCode;
	}
	public void setBizUnitCode(String bizUnitCode) {
		this.bizUnitCode = bizUnitCode;
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getCommodityName() {
		return this.commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getCommodityVersion() {
		return this.commodityVersion;
	}
	public void setCommodityVersion(String commodityVersion) {
		this.commodityVersion = commodityVersion;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorNm() {
		return this.creatorNm;
	}
	public void setCreatorNm(String creatorNm) {
		this.creatorNm = creatorNm;
	}

	public String getGmtInvalid() {
		return this.gmtInvalid;
	}
	public void setGmtInvalid(String gmtInvalid) {
		this.gmtInvalid = gmtInvalid;
	}

	public String getGmtValid() {
		return this.gmtValid;
	}
	public void setGmtValid(String gmtValid) {
		this.gmtValid = gmtValid;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPriceName() {
		return this.priceName;
	}
	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}

	public String getPriceOrigin() {
		return this.priceOrigin;
	}
	public void setPriceOrigin(String priceOrigin) {
		this.priceOrigin = priceOrigin;
	}

	public String getPriceTplId() {
		return this.priceTplId;
	}
	public void setPriceTplId(String priceTplId) {
		this.priceTplId = priceTplId;
	}

	public String getPriceTplVersion() {
		return this.priceTplVersion;
	}
	public void setPriceTplVersion(String priceTplVersion) {
		this.priceTplVersion = priceTplVersion;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
