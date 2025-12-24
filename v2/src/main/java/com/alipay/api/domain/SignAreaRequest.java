package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署区域信息
 *
 * @author auto create
 * @since 1.0, 2025-03-07 10:58:53
 */
public class SignAreaRequest extends AlipayObject {

	private static final long serialVersionUID = 5734475121871131516L;

	/**
	 * 签署页码，印章实际用印的页码
	 */
	@ApiField("pos_page")
	private Long posPage;

	/**
	 * 签署区位置横坐标，单位为像素。以左上角为坐标原点，向右为x轴，一般文件为A4格式(分辨率72像素)，图像像素为595x842（宽595高842），指定x坐标即可指定横坐标位置用印
	 */
	@ApiField("pos_x")
	private Long posX;

	/**
	 * 签署区位置纵坐标，单位为像素。以左上角为坐标原点，向下为y轴，一般文件为A4格式(分辨率72像素)，图像像素为595x842（宽595高842），y轴坐标即可指定纵坐标位置用印
	 */
	@ApiField("pos_y")
	private Long posY;

	public Long getPosPage() {
		return this.posPage;
	}
	public void setPosPage(Long posPage) {
		this.posPage = posPage;
	}

	public Long getPosX() {
		return this.posX;
	}
	public void setPosX(Long posX) {
		this.posX = posX;
	}

	public Long getPosY() {
		return this.posY;
	}
	public void setPosY(Long posY) {
		this.posY = posY;
	}

}
