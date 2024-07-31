package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增产品字段自定义数据
 *
 * @author auto create
 * @since 1.0, 2021-06-04 10:53:25
 */
public class AnttechBlockchainDefinProductDataAddModel extends AlipayObject {

	private static final long serialVersionUID = 2659779346994689656L;

	/**
	 * 业务线编码
物流金融：LGCT
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 自定义字段数据内容，支持json格式传输。具体字段结构由数据类型枚举值data_type决定
	 */
	@ApiField("data")
	private CustomizeDataObject data;

	/**
	 * 上传数据的数据类型枚举，用于确定data字段的数据结构。
目前枚举值有
EXT_PRODUCT_INSTANCE：表示为商业中台产品实例类型。
目前仅支持提交商业中台产品实例数据，其他枚举值待后续扩展。
	 */
	@ApiField("data_type")
	private String dataType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public CustomizeDataObject getData() {
		return this.data;
	}
	public void setData(CustomizeDataObject data) {
		this.data = data;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

}
