package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转化信息
 *
 * @author auto create
 * @since 1.0, 2026-07-23 17:18:53
 */
public class AdConversion extends AlipayObject {

	private static final long serialVersionUID = 3498375889492412298L;

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
