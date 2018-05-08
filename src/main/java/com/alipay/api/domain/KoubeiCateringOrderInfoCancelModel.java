package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐饮pos业务订单关闭
 *
 * @author auto create
 * @since 1.0, 2018-03-23 13:40:54
 */
public class KoubeiCateringOrderInfoCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4124451557243632626L;

	/**
	 * 关单时间,格式yyyy-mm-dd
	 */
	@ApiField("close_time")
	private Date closeTime;

	/**
	 * pos业务订单外部主键信息
	 */
	@ApiField("pos_order_key")
	private PosOrderKey posOrderKey;

	public Date getCloseTime() {
		return this.closeTime;
	}
	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}

	public PosOrderKey getPosOrderKey() {
		return this.posOrderKey;
	}
	public void setPosOrderKey(PosOrderKey posOrderKey) {
		this.posOrderKey = posOrderKey;
	}

}
