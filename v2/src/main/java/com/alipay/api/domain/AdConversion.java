package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转化信息
 *
 * @author auto create
 * @since 1.0, 2026-08-11 11:12:52
 */
public class AdConversion extends AlipayObject {

	private static final long serialVersionUID = 1492534782965966842L;

	/**
	 * 资产类型代码(asset)。标识广告投放在哪个端/载体
	 */
	@ApiField("asset_type_code")
	private String assetTypeCode;

	/**
	 * 资产类型名称
	 */
	@ApiField("asset_type_name")
	private String assetTypeName;

	/**
	 * 转化id
	 */
	@ApiField("conversion_id")
	private String conversionId;

	/**
	 * 转化事件名称
	 */
	@ApiField("conversion_name_show")
	private String conversionNameShow;

	/**
	 * 接入方式名称
	 */
	@ApiField("conversion_raw_data_type_name")
	private String conversionRawDataTypeName;

	/**
	 * 转化类型代码(converted_event)。标识一次具体转化行为的业务类型（如表单提交、下单、加购)
	 */
	@ApiField("conversion_type_code")
	private String conversionTypeCode;

	/**
	 * 转化事件名称
	 */
	@ApiField("conversion_type_name")
	private String conversionTypeName;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 转化窗口
	 */
	@ApiField("join_window_name")
	private AdConversionJoinWindow joinWindowName;

	public String getAssetTypeCode() {
		return this.assetTypeCode;
	}
	public void setAssetTypeCode(String assetTypeCode) {
		this.assetTypeCode = assetTypeCode;
	}

	public String getAssetTypeName() {
		return this.assetTypeName;
	}
	public void setAssetTypeName(String assetTypeName) {
		this.assetTypeName = assetTypeName;
	}

	public String getConversionId() {
		return this.conversionId;
	}
	public void setConversionId(String conversionId) {
		this.conversionId = conversionId;
	}

	public String getConversionNameShow() {
		return this.conversionNameShow;
	}
	public void setConversionNameShow(String conversionNameShow) {
		this.conversionNameShow = conversionNameShow;
	}

	public String getConversionRawDataTypeName() {
		return this.conversionRawDataTypeName;
	}
	public void setConversionRawDataTypeName(String conversionRawDataTypeName) {
		this.conversionRawDataTypeName = conversionRawDataTypeName;
	}

	public String getConversionTypeCode() {
		return this.conversionTypeCode;
	}
	public void setConversionTypeCode(String conversionTypeCode) {
		this.conversionTypeCode = conversionTypeCode;
	}

	public String getConversionTypeName() {
		return this.conversionTypeName;
	}
	public void setConversionTypeName(String conversionTypeName) {
		this.conversionTypeName = conversionTypeName;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public AdConversionJoinWindow getJoinWindowName() {
		return this.joinWindowName;
	}
	public void setJoinWindowName(AdConversionJoinWindow joinWindowName) {
		this.joinWindowName = joinWindowName;
	}

}
