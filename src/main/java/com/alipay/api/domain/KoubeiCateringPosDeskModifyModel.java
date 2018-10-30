package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 桌台信息修改
 *
 * @author auto create
 * @since 1.0, 2018-10-26 01:19:39
 */
public class KoubeiCateringPosDeskModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4272123114117626872L;

	/**
	 * 餐桌信息
	 */
	@ApiField("pos_desk")
	private DeskEntity posDesk;

	public DeskEntity getPosDesk() {
		return this.posDesk;
	}
	public void setPosDesk(DeskEntity posDesk) {
		this.posDesk = posDesk;
	}

}
