package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 转化数据回传
 *
 * @author auto create
 * @since 1.0, 2025-05-14 15:01:18
 */
public class AlipayDataDataserviceAdConversionUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2548871546596161693L;

	/**
	 * 代理商访问灯火平台的token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 转化数据列表, 最多1000条
	 */
	@ApiListField("conversion_data_list")
	@ApiField("conversion_data")
	private List<ConversionData> conversionDataList;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public List<ConversionData> getConversionDataList() {
		return this.conversionDataList;
	}
	public void setConversionDataList(List<ConversionData> conversionDataList) {
		this.conversionDataList = conversionDataList;
	}

}
