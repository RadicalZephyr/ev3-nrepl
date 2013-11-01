# ev3nrepl

Run clojure on your EV3!

## Usage

### Requirements

- A Lego Mindstorms EV3 (obviously)
- A 2GB micro SD card
- leinigen (probably some variant of 2)

### Setting Up

First off, you need to follow the instructions found on the
[leJOS sourceforge wiki](http://sourceforge.net/p/lejos/wiki/Creating%20a%20bootable%20SD%20card/)
for installing the leJOS kernel onto your SD card so you can boot your
EV3 into the leJOS operating system.  Once you have all that working,
and you are connected to your EV3 via USB cable or via wifi, you just
need to clone this git repository, then run `lein uberjar` and (if
connected via USB) `lein pushev3`.  If you're connected via wifi, then
you should scp the uberjar which should be `target/ev3nrepl.jar` onto
your EV3.

Now, ssh into the EV3, and run `jrun -jar ev3nrepl.jar`.  Now, wait.
The jvm takes a bit of time to start up on the EV3 and a clojure repl
takes longer still.  In my (limited) experience it usually takes about
1-3 minutes (I haven't timed it, okay?).

After a sufficient amount of time has elapsed, you should be able to
connect to an nrepl running on port 19324 on your EV3.  As part of
it's boot into the leJOS system it should have displayed it's IP
address.

Happy roboting!

## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
