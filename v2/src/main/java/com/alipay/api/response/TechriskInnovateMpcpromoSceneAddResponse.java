package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.mpcpromo.scene.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:56:41
 */
public class TechriskInnovateMpcpromoSceneAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5152621114887728782L;

	/** 
	 * 非法数据列表
	 */
	@ApiListField("illegal_goods_list")
	@ApiField("string")
	private List<String> illegalGoodsList;

	public void setIllegalGoodsList(List<String> illegalGoodsList) {
		this.illegalGoodsList = illegalGoodsList;
	}
	public List<String> getIllegalGoodsList( ) {
		return this.illegalGoodsList;
	}

}
