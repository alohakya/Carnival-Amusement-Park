package singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 金湘雯
 * @version : 1.0
 * @Project : MyDemo
 * @Package : singleton
 * @ClassName : VisitTip.java
 * @createTime : 2021/10/19 19:53
 * @Email : 249195279@qq.com
 * @Description :入园须知
 */
public enum VisitTip {
    INSTANCE;
    public static VisitTip getInstance(){
        String visit_tip="敬请注意：\n" +
                "\n" +
                "根据相关法律法规和政府部门的指导意见，所有游客及其随身行李在进入上海迪士尼乐园前必须进行安全检查。\n" +
                "造访上海迪士尼乐园的游客应遵守《上海迪士尼乐园游客须知》。\n" +
                "以下物品不得携带入园（包括但不限于）：易燃易爆物品；武器；需加热、再加热、加工、冷藏或保温的食品（如需加热水食用的方便面及带自热功能的食品等）及带有刺激性气味的食品（如榴莲等）；酒精饮料；罐装或玻璃容器；超出规定尺寸的行李；落地式三脚架；折叠椅及凳子；动物；相关法律禁止的物品及其他具有危险性或破坏性的物品。\n" +
                "详情及其他注意事项请见以下《上海迪士尼乐园游客须知》。\n" +
                "欢迎光临上海迪士尼乐园。为确保所有游客都能享有安全愉悦的乐园体验，敬请悉知：\n" +
                "\n" +
                "根据相关法律法规和政府部门的指导意见，所有游客及其随身行李在进入上海迪士尼乐园前必须进行安全检查。请遵循演职人员的指引进行安全检查程序。所有个人随身行李都必须接受检查，所有游客都需要通过金属探测器。\n" +
                "基于安全考量，个别手提包、包裹或其他物品可能无法携带入园。对无人看管的物品，我们将作适当处理。\n" +
                "游客可携带供本人食用的食品及饮料进入上海迪士尼乐园，但不允许携带需加热、再加热、加工、冷藏或保温的食品（如需加热水食用的方便面及带自热功能的食品等）及带有刺激性气味的食品（如榴莲等）。\n" +
                "请尊重乐园内的其他游客、演职人员（包括但不限于工作人员和演员）和迪士尼朋友，使用文明语言，不做任何危险、违法、破坏性或攻击性的行为。\n" +
                "为确保您和他人的安全，请勿在园内奔跑。\n" +
                "排队等候时，请尊重其他游客，请勿与他人发生冲撞、推搡。所有同行人员须一同排队。\n" +
                "游客在乐园内必须时刻保持着装整齐（包括上衣、裤子/裙子和鞋子）。除非在我们明确允许或鼓励的特别活动期间，十六周岁（含）及以上游客不可装扮成卡通、电影、漫画中角色的造型。不可穿着及地长衣。若着装不当、不雅或着装影响其他游客体验，可能会被拒绝入园或被要求离园。\n" +
                "十六周岁（含）及以上的游客不可佩戴口罩（医用口罩除外）。游客佩戴口罩时，不得遮盖双眼，确保任何时候视线都不被阻挡，能清晰看到周围事物。\n" +
                "除指定吸烟区外，乐园内禁止吸烟（包括烟草、电子香烟，或其他会产生烟雾的产品）。具体吸烟区位置请参阅乐园指南或咨询演职人员。\n" +
                "您应随时看管好您的私人财物，并自行为其安全负责。\n" +
                "请时刻照看好同行的儿童。不满十六周岁的游客须由十六周岁（含）及以上游客陪同入园。\n" +
                "游客是否可以乘坐各个游乐项目，视具体安全规则（如身高限制、身体健康状况限制）而定。不满七周岁的儿童须由十六周岁（含）及以上游客陪同乘坐游乐项目。\n" +
                "在游园期间，游客需要时刻保留门票，并在演职人员要求检查时出示门票。\n" +
                "我们在乐园入口的人脸识别专门通道上使用了人脸识别技术，用于已开启人脸识别入园功能的年卡持卡人入园的身份识别。年卡持卡人可以参阅上海迪士尼度假区官方网站上的上海迪士尼乐园年卡须知(https://www.shanghaidisneyresort.com/annual-pass-rules/)了解更多详情。 人脸识别通道上安装的人脸识别系统将拍摄经过该通道的游客的人脸照片（该照片将于拍摄当日从人脸识别系统中删除）。没有开启人脸识别入园功能的游客请使用其他通道入园。\n" +
                "请根据游乐项目等候时间及开放时间，计划行程。在乐园一天的运营时间内，游客可能无法体验所有游乐项目。\n" +
                "未经同意，门票及其他尊享礼遇不可转让及退款，法律另有规定除外。门票及其他尊享礼遇一经私自改动立即作废。门票仅供本人在有效期内使用，不适用于另行收费的特别活动。在乐园入口处，我们将拍摄您的照片作为门票持票人的身份认证。在领取迪士尼预约等候卡或购买迪士尼尊享卡或其他尊享礼遇时，若您使用他人的手机在上海迪士尼度假区官方手机应用程序（app）上扫描您的门票，您在乐园入口处拍摄的照片将会出现在他人手机的app上。您用手机在上海迪士尼度假区官方手机应用程序（app）上扫描您的门票后，该app上会出现您在乐园入口处拍摄的照片。若您同一天内多次入园，必须出示门票。\n" +
                "\n" +
                "不得携带以下物品入园：\n" +
                "\n" +
                "易燃易爆物品（如鞭炮）、武器、仿真武器或玩具枪（包括玩具爆破器、水枪等）。\n" +
                "酒精饮料。\n" +
                "罐装或玻璃容器（小型婴儿罐装食品除外）。\n" +
                "尺寸超过56厘米X 36厘米X 23厘米的箱包、容器或行李。\n" +
                "手推车及带轮子的运送工具——手推轮椅、不少于三个车轮且时速不超过16公里的残疾人电动辅助行动设备、尺寸不超过92厘米 X 132厘米的童车除外。\n" +
                "带滑轮的玩乐装备, 如旱冰鞋及带滑轮的鞋子、滑板、踏板车。\n" +
                "可能妨碍乐园及任何配套设施运营的摄影器材、摄像器材、落地式三脚架、稳定支架和相关工具；\n" +
                "折叠椅及凳子。\n" +
                "动物（导盲犬除外）。导盲犬须时刻栓有系绳并在主人的看管下。部分游乐项目也可能不允许导盲犬进入。\n" +
                "相关法律禁止的物品及其他具有危险性或破坏性的物品。\n" +
                "不得从事以下活动：\n" +
                "\n" +
                "未经我们允许，\n" +
                "销售、交换物品或服务，或出于销售或交换目的展示任何物品或服务，包括但不限于任何形式的导览服务或摄影服务。\n" +
                "分发、展示任何形式的印刷品或录制品，或使用任何旗帜、横幅或标牌。\n" +
                "进行集会、主题活动、演出或演讲。\n" +
                "使用相机/手机/手提摄影机之伸缩杆（例如自拍杆）。\n" +
                "进行摄影、摄像或录音，个人使用及非商业目的除外。\n" +
                "在未经事先许可的情况下从事任何采访行为，包括但不限于摄影、摄像、录音、采访游客或演职人员。\n" +
                "冒充或扮演任何迪士尼角色，对其他游客或乐园运营造成影响。\n" +
                "给园区内的动物喂食，包括鸟类。\n" +
                "放风筝，操控遥控设备，如无人机和遥控玩具。\n" +
                "任何危险行为或可能妨碍乐园及任何配套设施运营的行为。\n" +
                "任何违反中华人民共和国法律的行为。\n" +
                "公司权利：\n" +
                "\n" +
                "我们可能随时在乐园内摄像、摄影和/或录音。您进入乐园将视为您同意被摄像、摄影和/或录音，并同意我们将包含您肖像和/或声音的影像和/或录音用于我们的内部业务、行政和运营目的或其他直接相关的目的，用于满足法律、安全或保安要求的目的，或其它合法目的。\n" +
                "对于任何不遵守乐园规则或不遵守年卡、迪士尼预约等候卡、迪士尼尊享卡、乐园早享卡、迪士尼礼宾服务、迪士尼尊享导览或其他尊享礼遇专门规则的、或作出危险、违法、破坏性或攻击性行为之人士，或为保障安全、治安或秩序，或我们认为情况所需，我们有权拒绝该等人士进入乐园，或要求该等人士立即离开乐园而无须退款、负责或作出任何赔偿。\n" +
                "出于乐园承载量、恶劣天气包括但不限于台风（当上海中心气象台或浦东新区气象局发布蓝色或以上台风预警时）、高温（当上海中心气象台或浦东新区气象局发布橙色或以上高温预警时）、空气污染 （当上海中心气象台或浦东新区气象局发布空气重污染蓝色或以上预警、或当上海市环境监测中心或上海中心气象台公布的空气质量指数超过300时）、特别活动、乐园安全或游园秩序的考虑，或者在其他必要的情况下，\n" +
                "我们可能不定期更改乐园或乐园内任何游乐项目的开放时间、对不特定公众临时关闭乐园或乐园内的任何部分区域、控制入园人数、暂停或取消任何游乐项目或娱乐演出。\n" +
                "我们可能会拒绝个别游客入园或要求个别游客离园。\n" +
                "此游客须知可能变更。如法律另有强制性规定，则应以相应法律规定为准。\n" +
                "\n" +
                "此须知中提及的“我们”指“上海国际主题乐园有限公司”或“上海国际主题乐园和度假区管理有限公司”或以上两者。\n" +
                "\n" +
                "如有疑问，或遇紧急情况，请咨询演职人员。\n" +
                "\n";
        System.out.println(visit_tip);
        return INSTANCE;
    }
}
