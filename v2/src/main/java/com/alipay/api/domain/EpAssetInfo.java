package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业资产信息模型
 *
 * @author auto create
 * @since 1.0, 2023-06-27 09:53:35
 */
public class EpAssetInfo extends AlipayObject {

	private static final long serialVersionUID = 5637434767399365984L;

	/**
	 * 企业资产类型：
OP_CERTIFICATE(经营资质证照),
OP_PATENT(经营专利)
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * JSON数据列表，根据asset_type存放相应的数据,其中专利的单项结构是 { "patentName": "xx治疗xx的用途", "patentType": "发明公告", "applicationDay": "2003-09-24 00:00:00", "publishNo": "CN2525680Y"}，资质的单项结构是 { "certificateType": "科技型中小企业名单", "certificateNo": "2022110105A0007648"}
	 */
	@ApiField("contents")
	private String contents;

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getContents() {
		return this.contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

}
