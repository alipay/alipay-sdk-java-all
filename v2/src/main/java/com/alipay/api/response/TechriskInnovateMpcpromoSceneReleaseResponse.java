package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.mpcpromo.scene.release response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 20:10:27
 */
public class TechriskInnovateMpcpromoSceneReleaseResponse extends AlipayResponse {

	private static final long serialVersionUID = 5511658222644619394L;

	/** 
	 * 非法商品id列表
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
