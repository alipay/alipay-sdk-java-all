package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈主页地址创建修改接口
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:54:14
 */
public class KoubeiShopMallPageModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1864363749491737435L;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 商圈访问地址
	 */
	@ApiField("mall_url")
	private String mallUrl;

	/**
	 * 废弃！，务传。
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getMallUrl() {
		return this.mallUrl;
	}
	public void setMallUrl(String mallUrl) {
		this.mallUrl = mallUrl;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

}
