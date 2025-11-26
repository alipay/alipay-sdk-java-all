package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业同步的商家upc图片表结果
 *
 * @author auto create
 * @since 1.0, 2025-10-27 15:29:42
 */
public class AlipayMsaasMediarecogMmportalMerchantupcimgSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5614424352196758798L;

	/**
	 * 行业同步的商家upc图片表结果入参
	 */
	@ApiListField("list")
	@ApiField("merchant_upc_img_request_vo")
	private List<MerchantUpcImgRequestVo> list;

	public List<MerchantUpcImgRequestVo> getList() {
		return this.list;
	}
	public void setList(List<MerchantUpcImgRequestVo> list) {
		this.list = list;
	}

}
