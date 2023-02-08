package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 桌台信息修改
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:24:46
 */
public class KoubeiCateringPosDeskModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3761119555849121343L;

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
