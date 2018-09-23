// TODO: Insert License Header
package jcoco

import java.util.{ArrayList => JArrayList}

class PyAttr(
    private[this] val self: PyObject,
    private[this] val field: String)
  extends PyCallableAdapter {

  override def str: String =
    try {
      self.get(field).str
    } catch {
      case e: Exception => println(e.getMessage)
      "PyAttr Object"
    }

  override def getType: PyType =
    JCoCo.PyTypes.get(PyType.PyTypeId.PyBuiltInType)

  override def __call__(args: JArrayList[PyObject]): PyObject = {
    args.add(0, self)
    self.callMethod(field, args)
  }
}
