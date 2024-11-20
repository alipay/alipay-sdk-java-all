package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.mpcpromo.scene.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-05 11:44:40
 */
public class TechriskInnovateMpcpromoSceneCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8282813428775359382L;

	/** 
	 * 返回非法商品数据列表，该商品未导入到小程序云，创建场景时不能被选择。
	 */
	@ApiListField("illegal_goods_list")
	@ApiField("string")
	private List<String> illegalGoodsList;

	/** 
	 * 创建场景后，返回新创建的场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	public void setIllegalGoodsList(List<String> illegalGoodsList) {
		this.illegalGoodsList = illegalGoodsList;
	}
	public List<String> getIllegalGoodsList( ) {
		return this.illegalGoodsList;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}
	public String getSceneId( ) {
		return this.sceneId;
	}

}
