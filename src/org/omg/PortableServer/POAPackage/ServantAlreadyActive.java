package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/ServantAlreadyActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u112/7884/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Thursday, September 22, 2016 9:04:06 PM PDT
*/

public final class ServantAlreadyActive extends org.omg.CORBA.UserException
{

  public ServantAlreadyActive ()
  {
    super(ServantAlreadyActiveHelper.id());
  } // ctor


  public ServantAlreadyActive (String $reason)
  {
    super(ServantAlreadyActiveHelper.id() + "  " + $reason);
  } // ctor

} // class ServantAlreadyActive
