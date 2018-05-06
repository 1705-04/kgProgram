package common

/**
  * Created by tian on 2018/5/6.
  */
object GlobalCountans {
  /**
    * 默认值
    */
  final val DEFALUT_VALUE="unknown"
  /**
    * 日志分割标记
    */
  final val LOG_SPLIT_FLAG: String = "\\|"
  /**
    * bData
    */
  final val DEL_FLAG="bData"
  /**
    * 任务参数开始的标记
    */
  final val TASK_PARAMS_FLAG: String = "-d"

  /**
    * 任务运行日期
    */
  final val TASK_RUN_DATE = "task_run_date"

  /**
    * 日志存放根目录
    */
  final val LOG_DIR_PREFIX = "/logs/"
  /**
    * 任务的输入路径
    */
  final val TASK_INPUT_PATH: String = "task_input_path"
}
