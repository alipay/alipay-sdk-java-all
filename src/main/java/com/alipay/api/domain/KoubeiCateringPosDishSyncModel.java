package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自建盒子菜品同步接口
 *
 * @author auto create
 * @since 1.0, 2018-12-24 13:56:32
 */
public class KoubeiCateringPosDishSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6282578996739638313L;

	/**
	 * 自建盒子菜品的模型
	 */
	@ApiField("pos_dish_model")
	private PosDishModel posDishModel;

	public PosDishModel getPosDishModel() {
		return this.posDishModel;
	}
	public void setPosDishModel(PosDishModel posDishModel) {
		this.posDishModel = posDishModel;
	}

}
