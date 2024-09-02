package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用图片上传接口
 *
 * @author auto create
 * @since 1.0, 2020-12-31 11:49:04
 */
public class AlipayEcoMycarImageUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3574614399171653142L;

	/**
	 * 文件内容(图片字节数组做Base64转换后的字符串)
	 */
	@ApiField("img_content")
	private String imgContent;

	/**
	 * 图片格式，枚举：png、jpg、gif
	 */
	@ApiField("img_type")
	private String imgType;

	/**
	 * 场景类型
枚举：
洗车保养小图 ：MAINTAIN_PIC_S
洗车保养大图 :  MAINTAIN_PIC_L
车型 : CAR_TYPE
加油 : OIL
默认: DEFAULT（scene_type 为空时为默认)
根据类型场景校验大小（BASE64之前的大小），超过返回错误。
洗车保养小图最大60K
洗车保养大图最大100K
车型最大1M
加油最大1M
默认 100K
	 */
	@ApiField("scene_type")
	private String sceneType;

	public String getImgContent() {
		return this.imgContent;
	}
	public void setImgContent(String imgContent) {
		this.imgContent = imgContent;
	}

	public String getImgType() {
		return this.imgType;
	}
	public void setImgType(String imgType) {
		this.imgType = imgType;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
