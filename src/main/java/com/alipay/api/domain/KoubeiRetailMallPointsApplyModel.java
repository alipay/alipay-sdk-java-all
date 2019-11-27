package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈会员积分申请接口
 *
 * @author auto create
 * @since 1.0, 2018-01-04 15:38:55
 */
public class KoubeiRetailMallPointsApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4474988848143185226L;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

}
